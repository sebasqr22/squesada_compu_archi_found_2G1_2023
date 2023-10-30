module SPI_slave_tb();

	logic MOSI, CS, sclk, MISO, rst;
	reg [3:0] leds;
	
	
	SPI_slave spi(
		MOSI, CS, sclk, rst,
		MISO, leds
	);

	always begin
		#10 sclk = 1;
		#10 sclk = 0;
	end
	
	initial begin
		
		rst = 1;
		MOSI = 0;
		CS = 0;
		MISO = 0;
		leds = 4'b0000;
		#80
		
		rst = 0;
		MOSI = 1;
		$display(MISO);
		#20
		
		MOSI = 0;
		$display(MISO);
		#20
		
		MOSI = 1;
		$display(MISO);
		#20
		
		CS = 1;
		
	end

endmodule 
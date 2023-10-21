module SPI_slave_tb();

	logic MOSI, CS, sclk, MISO;
	reg [3:0] leds;
	
	
	SPI_slave spi(
		MOSI, CS, sclk,
		MISO, leds
	);

	always begin
		#20 sclk = 1;
		#20 sclk = 0;
	end
	
	initial begin
		
		MOSI = 0;
		CS = 0;
		MISO = 0;
		leds = 4'b0000;
		#80
		
		MOSI = 1;
		#80
		
		CS = 1;
		#80
		
		MOSI = 0;
		#80
		
		MOSI = 1;
		#80
		
		CS = 0;
		
	end

endmodule 
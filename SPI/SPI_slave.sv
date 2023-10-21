module SPI_slave(
	input logic MOSI, CS, sclk,
	output logic MISO, output reg [3:0] leds
);
	
	logic d, q, not_q;
	
	assign d = CS & MOSI;
	
	flipflop_D  ff_d(
		d, sclk,
		q, not_q
	);
	assign leds[0]=q;
	
	assign MISO = CS & q;
	
endmodule

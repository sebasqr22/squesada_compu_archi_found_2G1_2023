module SPI_slave(
	input logic MOSI, CS, sclk, rst,
	output logic MISO, output reg [3:0] leds
);
	
	logic d;
	assign d = MOSI & ~CS;
	//SALIDA
	flipflop_D  ff_d(
		MOSI, sclk, rst,
		MISO
	);
	
	//LEDS
	flipflop_D  ff_led0(
		.d(d), .clk(sclk), .rst(rst),
		.q(leds[0])
	);
	
	flipflop_D  ff_led1(
		.d(leds[0]), .clk(sclk), .rst(rst),
		.q(leds[1])
	);
	
	flipflop_D  ff_led2(
		.d(leds[1]), .clk(sclk), .rst(rst),
		.q(leds[2])
	);
	
	flipflop_D  ff_led3(
		.d(leds[2]), .clk(sclk), .rst(rst),
		.q(leds[3])
	);
	
endmodule

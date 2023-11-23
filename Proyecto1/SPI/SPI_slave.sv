module SPI_slave(
	input logic MOSI, CS, sclk, rst,
	output logic MISO, output reg [3:0] leds,output resetLed,output [6:0]res, output pwm_out
);
	
	logic d;
	
	assign d = MOSI & CS &~rst;
	
	assign resetLed=rst;
	assign MISO= rst == 1 ? 255:d;
	//SALIDA
	/*
	flipflop_D  ff_d(
		.d(d), .clk(sclk), .rst(rst),
		.q(MISO)
	);*/
	
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
	
	circuitoLogico cl(.A(leds[3]), .B(leds[2]), .C(leds[1]), .D(leds[0]), .res(res));
	pwm motor (.dutyMultiplier(leds), .clk(sclk), .rst(rst), .pwm_out(pwm_out) );
	
endmodule
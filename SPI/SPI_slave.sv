module SPI_slave(
	input logic MOSI, CS, sclk,
	output logic MISO, output reg [3:0] leds
);
	
	logic d, q, not_q;
	assign d= MOSI & ~CS;
	//SALIDA
	flipflop_D  ff_d(
		MOSI, sclk,
		MISO
	);
	
	//LEDS
	flipflop_D  ff_led0(
		d, sclk,
		leds[0]
	);
	flipflop_D  ff_led1(
		leds[0], sclk,
		leds[1]
	);
	flipflop_D  ff_led2(
		leds[1], sclk,
		leds[2]
	);
	flipflop_D  ff_led3(
		leds[2], sclk,
		leds[3]
	);
	
	
	
endmodule

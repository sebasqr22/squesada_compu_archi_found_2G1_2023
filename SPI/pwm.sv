module pwm (
	input reg[3:0] dutyMultiplier, input logic clk, rst,
	output pwm_out
);
	
	reg [7:0] counter = 0;
	wire [7:0] duty_cycle;		

	assign duty_cycle = dutyMultiplier * 10; 

	
	always @(posedge clk) 
		 counter <= rst ? 0 : (counter < 10) ? counter + 1 : 0;

	
	assign pwm_out = (counter < duty_cycle) ? 1 : 0;
	
	
endmodule

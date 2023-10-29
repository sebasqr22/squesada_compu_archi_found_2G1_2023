module pwm (
	input reg[3:0] dutyMultiplier, input logic clk, rst,
	output pwm_out
);
	
	reg[8:0] duty;
	reg [7:0] Q_reg, Q_next;
	
	always @ (posedge clk, negedge rst) begin
		if (!rst)
			Q_reg = 8'b00000000;
		else
			Q_reg = Q_next;
	end
	
	always @(*) begin
		Q_next = Q_reg + 1;
	end
	
	assign duty = dutyMultiplier * (2**8)/10;
	assign pwm_out = (Q_reg < duty);
	
endmodule

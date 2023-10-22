module flipflop_D(
	input logic d, clk, rst,
	output logic q
);
	
	
	always_ff @(posedge clk or posedge rst) begin
		q <= rst == 1 ? 0:d;
	end
	
endmodule
	
module flipflop_D(
	input logic d, clk,
	output logic q, not_q
);
	
	logic s, r;
	
	assign s = ~(d & clk);
	assign r = ~(~d & clk);
	assign q = ~(s & not_q);
	assign not_q = ~(r & q);
	
endmodule

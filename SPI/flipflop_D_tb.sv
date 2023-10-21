module flipflop_D_tb();

	logic d, clk, q, not_q;
	
	flipflop_D ffd(
		d, clk,
		q, not_q
	);
	
	always begin
		#20 clk = 1;
		#20 clk = 0;
	end
	
	initial begin
		d = 0;
		#40
		
		d = 1;
		#40
		
		d = 0;
		#40;
		
	end
	
endmodule
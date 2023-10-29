module pwm_tb();
	
	reg[3:0] dutyMultiplier; logic clk, rst, pwm_out;
	
	pwm prueba(
		dutyMultiplier, clk, rst,
		pwm_out
	);
	
	always begin 
		#2; clk = 0;
		#2; clk = 1;
	end
	
	initial begin
		rst = 0;
		#40
		
		rst = 1;
		dutyMultiplier = 5;
		#1024
		
		dutyMultiplier = 1;
		#1024
		
		dutyMultiplier = 10;		
		
	end
	
endmodule

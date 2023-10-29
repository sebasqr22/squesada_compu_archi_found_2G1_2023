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
		dutyMultiplier = 0;
		#1024
		
		dutyMultiplier = 1;
		#1024
		
		dutyMultiplier = 2;
		#1024
		
		dutyMultiplier = 3;
		#1024
		
		dutyMultiplier = 4;
		#1024
		
		dutyMultiplier = 5;
		#1024
		
		dutyMultiplier = 6;
		#1024
		
		dutyMultiplier = 7;
		#1024
		
		dutyMultiplier = 8;
		#1024
		
		dutyMultiplier = 9;
		#1024
		
		dutyMultiplier = 10;		
		
	end
	
endmodule

module circuitoLogico_tb();
logic a,b,c;
reg [6:0] res;

circuitoLogico cl(a,b,c,res);
initial begin 
	//0
	a=0;
	b=0;
	c=0;
	#40
	
	//1
	a=0;
	b=0;
	c=1;
	#40
	
	//2
	a=0;
	b=1;
	c=1;
	#40
	
	//3
	a=0;
	b=1;
	c=0;
	#40
	
	//4
	a=1;
	b=1;
	c=0;
	#40
	
	//5
	a=1;
	b=1;
	c=1;
	#40
	
	//6
	a=1;
	b=0;
	c=1;
	#40
	
	//7
	a=1;
	b=0;
	c=0;
	
	end


endmodule
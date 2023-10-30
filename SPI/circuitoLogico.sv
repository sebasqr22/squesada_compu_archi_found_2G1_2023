module circuitoLogico(A,B,C,D,res);
 input logic A;
 input logic B;
 input logic C;
 input logic D;
 output [6:0] res;
 reg [6:0] res;


assign res[0] = (~A&~B&~C&D)|(B&~C&~D);	//(~A&~B&C)|(A&B&~C);//a
assign res[1] = (~A&B&~C&D)|(~A&B&C&~D);	//A&C; //b
assign res[2] = ~B&C&~D;	//~A&B&C; //c
assign res[3] = (~B&~C&D)|(B&~C&~D)|(B&C&D);	//(~A&~B&C)| (A&~C); //d
assign res[4] = D|(B&~C);	//(~A&~B&C)| (B&~C) | (A&~C) | (A&B); //e
assign res[5] = (~B&C)|(C&D)|(~A&~B&D);	//(~A&C) | (~A&B) | (A&~B&~C); //f
assign res[6] = (~A&~B&~C)|(B&C&D);	//(~A&~B) | (~B&~C); //g
							
endmodule
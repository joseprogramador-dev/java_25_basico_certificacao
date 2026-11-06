public class AtribuicaoParte3{
	void main(){	
	  //=; +=; -=; *=; /=; %=; &=; ^=; |=;<<=; >>=; >>>=
	  int a,b,c;
	  boolean d,e,f;
	  a=b=c=10;//1010
	         //  0101
	         //  1111
	  d=e=f=true;
	  a&=5;
	  b^=5;
	  c|=5;
	  
	  d&=false;
	  e^=false;
	  f|=false;
	  
	  IO.println("a&=5: "+a);
	  IO.println("b^=5: "+b);
	  IO.println("c|=5: "+c);
	  IO.println("------");
	  IO.println("d&=false: "+d);
	  IO.println("e^=false: "+e);
	  IO.println("f|=false: "+f);
	}	  
}

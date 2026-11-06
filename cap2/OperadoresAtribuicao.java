public class OperadoresAtribuicao{
	void main(){	
	  //=; +=; -=; *=; /=; %=; &=; ^=; |=;<<=; >>=; >>>=
	  int a, b, c;
	  a=(b=(c=12));
	  int num1=10;
	  byte num2=15;
	  int num3=14;
	  num1+=10.6;
	  //num1=(int)(num1+20);
	  num2+=200;
	  num3+=(num3=40);
	  int num4=60;
	  String nome="Java ";
	  nome+=25;
	  
	  IO.println(num1);
	  IO.println(num2);
	  IO.println(a);
	  IO.println(b);
	  IO.println(c);
	  IO.println(num3);
	  IO.println(nome);
	  IO.println(num4=100);
	  
	}	  
}

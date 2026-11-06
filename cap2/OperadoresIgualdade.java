public class OperadoresIgualdade{
	void main(){	
	  int num1=65;
	  int num2=10;
	  String nome1= "Java";
	  String nome2= "Java";
	  Integer num3=200;
	  int num4=200;
	  char letra='A';
	  double num5=10;
	  Integer num6=10;
	  boolean a=true;
	  boolean b=false;
	  boolean c=true;
	  
	  //IO.println(10<5==true);
	  
	  
	  IO.println(num1!=num2);
	  IO.println(nome1==nome2);
	  IO.println(num3.equals(num4));
	  IO.println(num1==letra);
	  IO.println(num2==num5);	  
	  IO.println(num3==num4);
	  IO.println("---NULL--");
	  IO.println(num6==null);
	  IO.println(num6.intValue()==10);
	  //IO.println(num1==num2!=num3);
	  IO.println("-----boolean----");
	  IO.println(a==b!=c==a);
	  
	  
	  
	  
	}
}

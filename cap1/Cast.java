public class Cast{
	void main(){	
	  double num=10.99;
	  byte num2=(byte)512;
	  Integer num3=(Integer) 12;
	  Short num4= Short.valueOf((short)14);	  
	  Pessoa p= new Funcionario();
	  Funcionario f= (Funcionario)p;	  
    Object num5=58;
    long num6=(long)(int) num5;
    
    char letra=(char) 66;
	  
	  IO.println((int) num*3);
	  IO.println((int)(num*3));
	  IO.println(num2);
	  IO.println(num6);
	  IO.println(letra);
	}
}

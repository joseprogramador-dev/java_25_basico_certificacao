public class StringWrapper{
	void main(){
	  //Integer num1= new Integer("10");
	  Integer num1=Integer.valueOf("11");
	  int num2=Integer.parseInt("12");
	  Long num3=Long.valueOf("13");	  
	  Float num4=Float.valueOf("14");
	  Character letra=Character.valueOf('A');
	  //Integer num5="15";
	  Boolean teste1=Boolean.valueOf(null);
	  Double num5= Double.valueOf(" 15 ");
	  Byte num6= Byte.valueOf("16");
	  //Integer num7=Integer.valueOf("10_000_000");
	  Long num7=Long.valueOf("100");
	  Float num8= Float.valueOf(" 101d ");
	  Integer num9=Integer.valueOf("FF",16);
	  
	  Integer.valueOf("NaN");
	  Double.valueOf("Infinity");
	  Float num10=Float.valueOf("-Infinity");
	  
	  
	  IO.println(num1);
	  IO.println(num2);
	  IO.println(num3);
	  IO.println(num4);
	  IO.println(letra);
	  IO.println(teste1);
	  IO.println(num5);
	  IO.println(num7);
	  IO.println(num8);
	  IO.println(num9);
	  IO.println(num10);
	}
}

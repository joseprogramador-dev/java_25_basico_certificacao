public class ClassesWrapper{
	void main(){
	 	Short num1= Short.valueOf((short)15);
	 	Short num2=15;
	 	Byte num3=125;
	 	Long num4=100L;
	 	
	 	//Integer num5=110;
	 	//Integer num6=num5;
	 	//num6=150;
	 	
	 	Integer num5= Integer.valueOf(110); 
	 	Integer num6=num5;
	 	num6= Integer.valueOf(150);
	 	
	 	int num7= num6.intValue();
	 	
	 	Integer num8=null;
	 	int num9=num8.intValue();
	 	
	 	Short num10= 200;
	 	Short num11=200;
	 	//Integer num12=12;
	 	//num12++;
	 	Integer num12=Integer.valueOf(12);
	 	int temp=num12.intValue();
	 	temp++;
	 	num12=Integer.valueOf(temp);
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	
	 	IO.println(num1);
	 	IO.println(num2);
	 	IO.println(num3);
	 	IO.println(num4);
	 	IO.println(num5);
	 	IO.println(num10.equals(num11));
	 	IO.println(num12);
	}
}

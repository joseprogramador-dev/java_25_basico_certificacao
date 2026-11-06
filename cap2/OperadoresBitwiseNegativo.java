public class OperadoresBitwiseNegativo{
	void main(){	
	  // & | ^
	  int num1=~10;//00001010
	               //11110101	 
	  int num2=-11;//11110101
	  int num3=12; //00001100
	               //00000100 &
	               //11111101 |
	               //11111001
	  IO.println(num1);
	  IO.println(num2 & num3);
	  IO.println(num2 | num3);
	  IO.println(num2 ^ num3);

	}	  
}

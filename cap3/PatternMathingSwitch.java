public class PatternMathingSwitch{
	void main(){	
	  Number num=Integer.valueOf(12);
	  String resultado=switch(num){
	    case Integer i when i<15 && i>8 ->{
	        yield "Integerrrrr " +i;
	      }
	    case Integer i -> "Integer 2 " +i;
	    case Double d-> "Double "+d;
	    case Long i-> "Long "+i;
	    case Number n-> "Default";
	  };	 
	  IO.println(resultado);
	}
}

public class OperadoresCondicionais{
	void main(){	
	  boolean a=true;
	  boolean b=false;
	  Boolean c=Boolean.valueOf(null);
	  int num=10;
	  c=b||(++num>5);
	  
	  IO.println(a&&b);
	  IO.println(a||b);
	  IO.println(c&&b);
	  IO.println(num);
	  
	  IO.println(true||false && false);
	  IO.println(true || false & false);
	}	  
}

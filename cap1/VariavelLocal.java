public class VariavelLocal{
  int num2=0;
  double num3=0.0;
  boolean teste=false;
  char letra='\u0000';
  Integer num4;
  int num5=12;
  {
    int num5=100;
  }
  
	void main(){	
	  int num;  
	  int num5=7;
	  int _=20;
	  //teste(num);
	  IO.println("-----");
	  IO.println(num2);
	  IO.println(num4);
	  IO.println(num5);
	  IO.println("-----");
	  if(num5==7){
	    num=15;
	  }else{
	    num=25;
	  }
	  IO.println(num);
	}
	void teste(int num){
	  IO.println(num5);
	}
}

public class PatternMatching{
	void main(){
	  Number num1= Integer.valueOf(124); 
	  escreverSomenteInteiro(num1);

	  if(num1 instanceof String nome){
	  
	  }
	  if(num1 instanceof final Integer num2 && num2>100){
	    //Integer num2=(Integer) num1;
	    //num2=80;
	    IO.println(num2.compareTo(100));
	  }else{
	    IO.println("ELSE");
	  }
	  
	}	
	void escreverSomenteInteiro(Number number){
	  if(number instanceof Integer num){
	    IO.println(num);
	  }
	  return;
	}
	  
	/*
	  if(!(number instanceof Integer num)){
	    return;
	  }
	  IO.println(num);
	  
	}
	*/
}

public class ExpressaoSwitch{
	void main(){
	  int nota=5;
	  
	  String resultado=switch(nota){
	    case 9,10-> {
	        if(false){
	          yield "Excelente!!!";
	        }else{
	          yield "Excelente!!!!!!";
	        }
	      }
	    case 7,8 -> "Bom";
	    case 5,(byte)6->{
	      throw new RuntimeException("Teste");
	      //"Regular";
	    }
	    default-> "Insuficiente";
	    
	  };
	  IO.println(resultado);
	   
	}
}

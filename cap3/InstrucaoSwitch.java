public class InstrucaoSwitch{
	void main(){
	  byte nota=10;
	  final int aux=10;
	  String resultado;
	  
	  switch(nota){	    
	    case 9,5*2:
	      IO.println("Excelente!!");	  
	    case 5,(byte)6:
	      IO.println("Regular!!!");
	      break;	   
	    case 7,8:
	      IO.println("Bom!!!");
	      break;
	     default:
	      IO.println("Insuficiente!!!"); 
	      break;       
	  
	  }
	  IO.println("------");
	  String nome="José";
	  switch(nome){
	    case "José"->{ IO.println("Achou");}
	    case "Teste"-> IO.println("Não achou");
	  }
	  
	  
	  
	  
	  
	  //IO.println(resultado);
	  /*
	  if(nota>=9){
	    resultado="Excelente!!!";
	  }else if(nota>=7){
	    resultado="Bom!!!";
	  }else if(nota>=5){
	    resultado="Regular!!!";
	  }else{
	    resultado="Insuficiente!!!";
	  }
	  */
	  
	 
	}
}

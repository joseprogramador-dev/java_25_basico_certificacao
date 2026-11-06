public class EnumSwitch{
  enum Classificacao {INSUFICIENTE, REGULAR, BOM, EXCELENTE}
	void main(){	
	  Classificacao c=Classificacao.EXCELENTE;
	  String resultado=switch(c){
	    case Classificacao.INSUFICIENTE-> "Insuficiente";
	    case REGULAR -> "Regular";
	    case BOM -> "Bom";
	    default -> "Excelenteeeeeeee!!!";
	    case EXCELENTE -> "Excelente!!!";
	  };
	  
	  IO.println(resultado);
	
	}
}

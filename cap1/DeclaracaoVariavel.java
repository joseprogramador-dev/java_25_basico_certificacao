public class DeclaracaoVariavel{
  private static final int NUM_ELEMENTO=30;
	void main(){	  
	  int variavel=10;
	  int variAvel=20;
	  int num =30;
	  int nomeDaPessoa;
	  //int _=40;
	  //int num2=_;
	  
	  IO.println(variavel);
	  IO.println(variAvel);
	  
	  try{
	    Integer num3= Integer.valueOf("");
	  }catch (NumberFormatException _){
	    IO.println("Erro de formatação de número");
	  }
	}
}

public class ColetorLixo{
	void main() throws InterruptedException{
	  String nome1= new String("José");
	  String nome2= new String("Programador");
	  
	  nome1=nome2;
	  
	  Pessoa p1= new Pessoa();
	  Pessoa p2= new Pessoa();
	  p1.setAmigo(p2);
	  p2.setAmigo(p1);
	  
	  p1=null;
	  p2=null;
	  
	  System.gc();
	  
	  for(int i=0;i<100;i++){
	    Thread.sleep(1000);
	    p1= new Pessoa();
	    IO.print("-");
	  }
	  
	}
}

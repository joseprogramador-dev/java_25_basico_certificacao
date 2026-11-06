public class TipoReferencia{
	void main(){
	  int num=50;
	  int num2=num;
	  num2=60;
	  
	  Pessoa p1= new Pessoa("José",32);
	  Pessoa p2=p1;
	  p2.setNome("Maria");
	  
	  IO.println(num);
	  IO.println(num2);
	  IO.println("============");
	  IO.println("Nome: "+p1.getNome());
	   IO.println("Nome: "+p2.getNome());
	  IO.println("Idade: "+p1.getIdade());
	  
	
	}
}

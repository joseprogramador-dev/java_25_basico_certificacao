public class Pessoa{
	private String nome;
	private int idade;
	
	public Pessoa(){	
	}
	public Pessoa(String nome, int idade){
	  if(idade==30){
	    IO.println("Idade igual a 30");
	    //return;
	  }
	  super();
	  if(idade==30){
	    IO.println("Idade igual a 30");
	    return;
	  }
	  this.nome=nome;
	  this.idade=idade;
	}
	
	public String getNome(){
	  return this.nome;
	}
	public void setNome(String nome){
	  this.nome=nome;	  	
	}
	public int getIdade(){
	  return this.idade;
	}
	public void setIdade(int idade){
	  this.idade=idade;
	}
	
	public void apresentar(){
	  System.out.println("Meu nome é: "+nome+ " e tenho "+idade+" anos.");
	}
	
	
}

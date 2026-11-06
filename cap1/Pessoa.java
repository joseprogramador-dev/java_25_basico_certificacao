public class Pessoa{
	private String nome;
	private int idade;
	private Pessoa amigo;
	
	public Pessoa(){	
	}
	public Pessoa(String nome, int idade){
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
	public Pessoa getAmigo(){
	  return this.amigo;
	}
	public void setAmigo(Pessoa amigo){
	  this.amigo=amigo;
	}
	
	public void apresentar(){
	  System.out.println("Meu nome é: "+nome+ " e tenho "+idade+" anos.");
	}
	
	
}

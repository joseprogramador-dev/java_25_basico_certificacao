public class Funcionario extends Pessoa{
	private String funcao;	

	public Funcionario(){	 
	}
	public Funcionario(String funcao, String nome, int idade){
	  this.funcao=funcao;
	  super(nome, idade);
	}
	
	public String getFuncao(){
		return funcao;
	}
	public void setFuncao(String funcao){
		this.funcao=funcao;
	}
	
}

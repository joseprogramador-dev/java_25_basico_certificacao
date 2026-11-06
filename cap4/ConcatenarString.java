public class ConcatenarString{
  void main(){
    String nome= "Teste"+(1+5)+2;
    String nome2=12+"";
    Pessoa p= new Pessoa("José",35);
    nome+=5+5;
    nome=nome.concat("xXx");
    nome+=null;
    
    
    IO.println(nome);
    IO.println("Nome: "+p);
    
  }
}

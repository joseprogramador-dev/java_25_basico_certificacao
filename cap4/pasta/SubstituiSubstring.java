public class SubstituiSubstring{
  void main(){    
    String texto="Java é top!!!";
    String texto2="banana.";
    String texto3="aaa";
    
    IO.println(texto.replace('a','x'));
    IO.println(texto.replace("top","bão demais da conta"));
    IO.println(texto2.replace("na",""));
    IO.println(texto2.replace(".","-"));
    IO.println(texto2.replaceAll("\\.","-"));
    IO.println(texto3.replace("aa","x"));
    IO.println(texto.replace('a',"X"));
    
  }
}

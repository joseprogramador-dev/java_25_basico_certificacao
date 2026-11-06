public class BuscaSubstring{
  void main(){    
    String texto="Java é bão demais!!!";
    
    IO.println(texto.startsWith("Java"));
    IO.println(texto.startsWith("é bão",5));
    IO.println(texto.endsWith("demais!!"));
    IO.println(texto.contains("bão"));
  }
}

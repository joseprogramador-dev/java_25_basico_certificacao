public class IndexOf{
  void main(){    
    String texto="José ProgrAmador";
    String texto2="AX😀BC";
    
    IO.println(texto.indexOf('A'));
    IO.println(texto.indexOf(65));
    IO.println(texto.indexOf('o',100));
    IO.println(texto.indexOf('r',0,8));
    IO.println("-----");
    IO.println(texto.indexOf("sé"));
    IO.println(texto.indexOf("ma",5));
    IO.println(texto.indexOf("rog",5,10));
    IO.println(texto2.indexOf(0x1F600));
    
  }
}

public class Substring{
  void main(){
    String texto="José Programador";
    
    String texto2=texto.substring(0,16);
    String texto3=texto.substring(0);
    String texto4="A😊B";
    
    IO.println(texto.substring(0,4));
    IO.println(texto.substring(5));
    IO.println("'"+texto.substring(1,1)+"'");
    IO.println("'"+texto.substring(16)+"'");
    IO.println("-----------");
    IO.println(texto2==texto3);
    //texto=texto.substring(0,5);
    //IO.println(texto);
    IO.println("-----------");
    IO.println(texto.substring(5).substring(0,3));
    IO.println(texto4.substring(0,3));
    IO.println("-----------");
    IO.println(texto.substring(30,30));
    
    
    
    
  }
}

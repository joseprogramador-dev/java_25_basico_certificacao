public class CaracteresString{
  void main(){
    String texto1= "ABCD";
    String texto2= "A😀BC";
    
    IO.println(texto1.charAt(0));
    IO.println(texto1.length());
    IO.println(texto2.length());
    IO.println("------Char Texto 2------");
    IO.println((int)texto2.charAt(1));
    IO.println((int)texto2.charAt(2));
    IO.println("---");
    IO.println(texto2.codePointAt(1));
    IO.println(texto2.codePointAt(2));
    IO.println(Integer.toHexString(128512));
    IO.println("------Before------");
    IO.println(texto1.codePointBefore(1));
    IO.println(texto2.codePointBefore(2));
    IO.println(texto2.codePointBefore(3));
    IO.println("------Count------");
    IO.println(texto1.codePointCount(0,texto1.length()));
    IO.println(texto2.codePointCount(0,texto2.length()));
    IO.println(texto1.codePointCount(0,1));
    
    
  }
}

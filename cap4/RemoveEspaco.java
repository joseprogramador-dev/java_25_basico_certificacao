public class RemoveEspaco{
  void main(){   
    String texto="\u2003José Programador\u2003";
    
    IO.println("'"+texto+"'");
    IO.println("'"+texto.stripLeading()+"'");
    IO.println("'"+texto.stripTrailing()+"'");
    IO.println("'"+texto.trim()+"'");
    IO.println("'"+texto.strip()+"'");
    
    
  }
}

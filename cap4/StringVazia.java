public class StringVazia{
  void main(){   
    String vazia="";
    String blank="   ";
    
    IO.println(vazia.isEmpty());
    IO.println(blank.isEmpty());//false
    IO.println(vazia.isBlank());
    IO.println(blank.isBlank());
    
    
  }
}

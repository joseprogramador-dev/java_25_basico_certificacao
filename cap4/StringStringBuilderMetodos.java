public class StringStringBuilderMetodos{
  void main(){  
    StringBuilder sb= new StringBuilder("Java é Top!!!");
    
    IO.println(sb.substring(5));
    IO.println(sb.substring(0,4));
    IO.println(sb.indexOf("é"));
    IO.println(sb.indexOf("a",2));
    IO.println(sb.charAt(5));
    IO.println(sb.length());
    
      
  }
}

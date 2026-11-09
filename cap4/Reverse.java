public class Reverse{
  void main(){ 
    StringBuilder sb1= new StringBuilder();
    StringBuilder sb2= new StringBuilder("A😀B");
    sb1.append("Java é Top");
    
    sb1.reverse().reverse();    
    IO.println(sb1);
    
    sb1.reverse();    
    IO.println(sb1);
    
    IO.println(sb2.reverse());
    
  }
}

public class Delete{
  void main(){ 
    StringBuilder sb1= new StringBuilder("Java é Excelente"); 
    sb1.delete(4,4);
    
    IO.println(sb1);
    sb1.deleteCharAt(0);
    IO.println(sb1);
  }
}

public class AcrescentandoCodePoint{
  void main(){ 
    //codePointAt, codePointBefore, codePointCount
    StringBuilder sb= new StringBuilder();
    sb.appendCodePoint(65);
    sb.append((char) 65);
    sb.append(65);
    sb.appendCodePoint(128512);
    sb.appendCodePoint(0x1F600);
    
    IO.println(sb);
    
      
  }
}

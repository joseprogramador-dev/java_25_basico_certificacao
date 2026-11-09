public class Acrescentando{
  void main(){ 
    char[] letras={'J','a','v','a'};
    int[] numeros={1,2,3,4,5};
    StringBuilder sb1= new StringBuilder().append("Teste");
    sb1.append(10).append(10.0).append(10.0f).append(10L)
    .append(true);
    sb1.append("Java é Top",0,4);
    sb1.append("-");
    sb1.append(letras);
    sb1.append("-");
    sb1.append(numeros);
    sb1.append("-");
    sb1.append(10+50);
    
    IO.println(sb1);
      
  }
}

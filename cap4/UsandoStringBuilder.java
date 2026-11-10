public class UsandoStringBuilder{
  void main(){  
    StringBuilder sb1= new StringBuilder();
    StringBuilder sb2= new StringBuilder("Teste");
    StringBuilder sb3= new StringBuilder(10);
    StringBuilder sb4=sb2;
    
    String str1="Teste";
    String str2=str1;
    str1+="-Teste";
    
    
    sb3.append("Teste-Teste-");
    IO.println(sb3.length());
    IO.println(sb3.capacity());
    IO.println("--------");
    sb2.append("-Teste2");
    IO.println(sb2);
    IO.println(sb4);
    IO.println("----String----");
    IO.println(str1);
    IO.println(str2);
    
    
      
  }
}

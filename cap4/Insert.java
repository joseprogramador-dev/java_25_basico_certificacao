public class Insert{
  void main(){ 
      String texto="Java-é top";
      char[] letras={'J','a','v','a','-','é',' ','t','o','p'};
      StringBuilder sb1= new StringBuilder("José Programador");
      StringBuilder sb2= new StringBuilder("Java");
      StringBuilder sb3= new StringBuilder();
      StringBuilder sb4= new StringBuilder();
      StringBuilder sb5= new StringBuilder();
      
      sb1.insert(4," -");
      sb1.insert(sb1.length()," - O Melhor");
      
      sb2.insert(4, " é top!");
      sb2.insert(10," e muito legal");
      
      sb3.insert(0,"A");
      sb3.insert(0,"B");      
      sb3.insert(0,"C");
      
      IO.println(sb1);
      IO.println(sb2);
      IO.println(sb3);
      IO.println(sb4.insert(0,texto, 0,4));
      IO.println(sb5.insert(0,new char[]{'J','a','v','a','-','é',' ','t','o','p'},0,5));
      
  }
}

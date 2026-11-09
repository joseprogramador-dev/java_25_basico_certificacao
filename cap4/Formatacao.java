public class Formatacao{
  void main(){   
      var pi = 3.14159265359;
      IO.println("Java"+ " é "+10);
      IO.println(String.format("'%10s é %04d'", "Java", 10_000));
      IO.println("------");
      IO.println(pi);
      IO.println(String.format("'%8.2f'",pi));
      IO.println("'%10s é %04d'".formatted("Java",10));
  }
}

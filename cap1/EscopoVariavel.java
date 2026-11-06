public class EscopoVariavel{
  String nome="José";
  static String sobrenome;
  void main(){
    EscopoVariavel e1= new EscopoVariavel();
    e1.nome="Maria";
    e1.sobrenome="Qualquer";
    
    
    EscopoVariavel e2= new EscopoVariavel();
    e2.nome="Programadora";
    e2.sobrenome="Coisa";
    
    IO.println("----Nome----");
    IO.println(e1.nome);
    IO.println(e2.nome);
    IO.println("----Sobrenome----");
    IO.println(e1.sobrenome);
    IO.println(e2.sobrenome);
    
    
  /*
    int num=25;
    if(true){
      //int num=80;
    }else{
      int num3=80;
    }
    if(true){
      int num2=35;
      IO.println(num);
      if(true){
        IO.println(num2);       
      }
    }    
    IO.println(num);
    
    for(int i=0;i<10;i++){
    
    }
    */
    
  }
  void testar(int numero){
    
  }
}

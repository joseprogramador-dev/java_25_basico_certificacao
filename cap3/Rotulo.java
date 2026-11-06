public class Rotulo{
  void main(){
    int num=10;
    int externo=200;
    int result;
    
    externo:
    for(int i=0;i<3;i++){
      switch(i){
        case 5-> IO.println("Alguma coisa");
        case 2-> {
            break externo;
          }
      }
      IO.println(i+" ");
    }
    IO.println("\n---------");
    
    externo:{
      IO.println("Entrou no bloco");
      if(num==5){
        IO.println("Nada 1");
      }
      if(num==10){
        break externo;
      }
      if(num==15){
        IO.println("Nada 2");
      }
      IO.println("Nada 3");
      
    }
    IO.println("--------");
  
    outro:
    externo:
    for(int i=0;i<10;i++){
      for(int j=0;j<10;j++){
        try{
          if(j==3){
            break outro;
          }
          IO.println(i+" "+j);
        }finally{
          IO.println("Finally");
        }
      }
      
    }
    
  }
}

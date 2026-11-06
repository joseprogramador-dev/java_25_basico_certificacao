import java.util.*;
public class Return{
  void main(){
    List<Integer> lista= List.of(1,2,3,4,5);
    lista.forEach(n->{
      if(n==3){
        return;
      }
      IO.print(n+" ");
    });
  
    IO.println("\n-------");
    Pessoa p= new Pessoa("José",30);  
    IO.println(p.getNome());
    IO.println("------");
    
  
	  int result=calcular(5,3);
	  if(result==7){
	    return;
	  }
	  IO.println("-------");
	  IO.println(result);
	  IO.println("Chegou até aqui");
	  	  
  }
  int calcular(int a, int b){
    int num=10;
    try{
      return num;
      
    }finally{
      num=15;
      IO.println(num);
      IO.println("Finally");
    }
  
    /*
    while(true){
      IO.print(".");
    }
    for(int i=0; i<3; i++){
      for(int j=0;j<3;j++){
        return 12;
      }
    }
    return 0;
    */
  }
}

import java.util.*;
import java.util.function.*;
public class UsandoVar{
  void var(int numero){
    var var=500;
    IO.println("========");
    IO.println(var);
    IO.println("========");
  }
  
  
	void main(){
	  var(10);
    final var generica=10;
    //generica=11;
    var a=Integer.parseInt("17");
    var array=new int[]{10,20,30};
    List<String> lista= new ArrayList<>();
    var listaVar=new ArrayList<String>();
    listaVar.add("José");
    listaVar.add("Programador");
    var soma=(BinaryOperator<Integer>)(var b, var c)->b+c;
    
    //a=null;
    
    IO.println(generica);
    IO.println(listaVar);
	}
}

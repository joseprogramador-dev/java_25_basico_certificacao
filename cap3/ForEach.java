import java.util.*;
public class ForEach{
	void main(){		
	  List<Integer> numeros= new ArrayList<>();
	  numeros.add(5);
	  numeros.add(4);
	  numeros.add(3);
	  numeros.add(2);
	  numeros.add(1);
	  
	  int[] nums={1,2,3,4,5};
	  for(var num: nums){
	    num+=1;
	  }
	  for(var num:nums){
	    IO.print(num+" ");
	  }
	  IO.println();
	  for(Integer num: numeros){
	    IO.print(num+" ");
	    if(num==3){
	      numeros.remove(num);
	    }
	  }
	  IO.println();
	}
}

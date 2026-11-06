public class Continue{
	void main(){
	  for(int i=0;i<3;i++){
	    try{
	      if(i==2){
	        continue;
	      }
	      IO.println("try - "+i+" ");	    
	    }finally{
	      IO.println("Finally");	    
	    }
	  }
	  IO.println("------");
	  for(int i=0;i<5;i++){
	    for(int j=0;j<5;j++){
        if(j==2){
          continue;
        }	      
	      IO.println(i+" "+j);
	    }	    
	    
	  }
	  IO.println();
	  
  }
}

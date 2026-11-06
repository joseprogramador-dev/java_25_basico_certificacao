public class Break{
	void main(){
	  int num=14;
	  switch(num){
	    case 14->{
	        IO.println("Achou");
	        break;
	      }
	    
	  }
	  for(int i=0; i<10;i++){
	    try{
	      IO.println("try");
	      break;
	    }finally{
	      IO.println("Finally");
	    }
	  }
	  IO.println("-------");
	  for(int i=0; i<10;i++){	    
	    for(int k=0;k<10;k++){
	      IO.println(i+" "+k);
	      if(k==0){
	        break;
	      }
	    }
	  }
	  IO.println();
	  int j=0;
	  do{
	    IO.print(j+" ");
	    j++;
	    if(j==5){
	      break;
	    }
	  }while(j<10);
	  IO.println();
  }
}

public class PosIncrementoDecremento{
	void main(){	
	  int num=20;
	  byte num2=30;
	  short num3=40;
	  char letra='A';
	  Integer num4=50;	  
	  int resultado=-num++;
	  int[] nums={1,2,3};
	  int indice=0;
	  
	  num2++;
	  num3++;
	  letra++;
	  num4++;
	  
	  IO.println(num);
	  IO.println(num2);
	  IO.println(num3);
	  IO.println(letra);
	  IO.println(num4);
	  IO.println(resultado);
	  IO.println(nums[indice++]++);
	  
	}
}

public class OperadorTernario{
	void main(){	
	  boolean a=false;
	  boolean b=true;
	  String resultado="Teste"+(a?"Verdadeiro":"Falso");
	  double num=a?10.5:5;
	  byte num1=15;
	  byte num2=a?127:num1;
	  int letra=a?66:'A';
	  Integer num3=10;
	  Integer resultInt=a||true?num3:65;
	  String result2= resultado instanceof String texto?
	    texto.toUpperCase():
	    "Nada";
	  
	  IO.println(resultado);
	  IO.println(num2);
	  IO.println(letra);
	  IO.println(resultInt);
	  IO.println(result2);
	  IO.println(a?"A":(b?"B":"C"));
	  IO.println(a?(b?"A":"B"):"C");
	  IO.println((a?b:true)?"A":"B");
	}	  
}

package aula_java;

public class aula_dois {

	public static void main(String[] args) {
	
		double d = 100.99;
          int i = 100;
        // aqui ocorre a pro��o matem�tica
        // i � convertido para double e ent�o multiplicado
        d = d * i ;
        //ao contr�rio � necess�rio informar om casting
        long x = 12345;
        float pi = 3.14f;
        x = x * (long) pi;
        //ou ent�o, converte apenas o resultado
        x = (long) (x * pi) ;
        
	}

}

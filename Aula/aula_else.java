package aula_java;

public class aula_else {

	public static void main(String[] args) {
		int idade = 20;
		if (idade <= 12) {
			System.out.println("Criança");
		}
		else if (idade <= 19) {
			System.out.println("Adolescente");
		}
		else if (idade <= 60) {
			System.out.println("Adulto");
		}
		else {
			System.out.println("Idoso");
		}
	}

}

package lista5;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Double nota;
		boolean primeira = true;
		
		do {
			if (primeira) {
				System.out.print("Digite uma nota de zero a dez: ");
			}
			else {
				System.out.print("ERRO. A nota deve estar entre 0 e 10, por favor digite novamente: ");
			}
			nota = sc.nextDouble();
			primeira = false;
		} while (nota < 0 || nota > 10);
		
		System.out.println("Obrigado!");
		sc.close();
	}

}

package lista5;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String nom, senha;
		
		do {
			System.out.print("nome: ");
			nom = scan.nextLine();
			
			System.out.print("senha: ");
			senha = scan.nextLine();
			
			if (nom.equals(senha)) { System.out.println("Aprovado"); }
			else {System.out.println("ERRO. Senha igual ao nome. Digite novamente.");}
		} while (senha.equals(nom));
		
	}
}

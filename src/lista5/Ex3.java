package lista5;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		boolean aprovado;
		Scanner sc = new Scanner(System.in);
		String nome, sexo, esCivil;
		int id;
		Double sal;
		
		do {
			System.out.println("Nome: ");
			nome = sc.nextLine();
			
			System.out.println("idade: ");
			id = sc.nextInt();
			
			System.out.println("Salario: ");
			sal = sc.nextDouble();
			
			System.out.println("sexo: ");
			sexo = sc.nextLine();
			
			System.out.println("Estado civil: ");
			esCivil = sc.nextLine();
			
			
			aprovado = true;
			if (nome.length() < 3) {
				System.out.println("ERRO! o nome deve ter mais que 3 caracteres"); 
				aprovado = false;
			}
			
			if (id < 0 || id > 150) {
				System.out.println("ERRO! idade deve estar no intervalo 0-150"); 
				aprovado = false;
			}
			
			if (sal < 0) {
				System.out.println("ERRO! Salario deve ser maior que 0"); 
				aprovado = false;
			}
			
			if (!("f".equalsIgnoreCase(sexo) || "m".equalsIgnoreCase(sexo) )) {
				System.out.println("ERRO! sexo eh M ou F"); 
				aprovado = false;
			}
			
			if (esCivil != "s" && esCivil != "c" &&
				esCivil != "v" && esCivil != "d"	) {
				System.out.println("ERRO! O estado civil eh invalido"); 
				aprovado = false;
			}
		} while (aprovado);
		
		System.out.println("Dados aprovados!");
		
		
	}
}

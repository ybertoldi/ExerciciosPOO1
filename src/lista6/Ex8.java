package lista6;

import java.util.Scanner;

public class Ex8 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char cons[] = new char[]
				{
				'b', 'c', 'd' ,'f', 'g', 'h' ,'j', 'k', 'l', 'm',
				'n', 'p', 'q', 'r', 's', 't', 'v', 'x', 'y', 'w', 'z'
				};
		
		char vog[] = new char[] 
				{
				'a', 'e', 'i', 'o', 'u'
				};
	
		
		System.out.print("Informe o tamanho da senha: ");
		int n = scan.nextInt();
		
		int rand;
		boolean vogal = false;
		char proxLetra;
		String senha = "";
		
		for (int i = 0; i < n; i++) {
			
			if (i == n - 1 && n % 2 != 0) {
				rand = (int)(Math.random() * vog.length);
				proxLetra = vog[rand];
			}
			else if (vogal) {
				rand = (int)(Math.random() * vog.length);
				proxLetra = vog[rand];
			}
			else {
				rand = (int)(Math.random() * cons.length);
				proxLetra = cons[rand];
			}
			
			senha += proxLetra;
			vogal = !vogal;
		}
		
		System.out.println("Senha recomendada: " + senha);		
		scan.close();
	}
}

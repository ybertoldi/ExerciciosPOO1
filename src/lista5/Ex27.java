package lista5;

import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		boolean temProduto = true;
		int count = 0;
		Double total = 0D;
		
		Scanner scan = new Scanner(System.in);
		Double precoAtual;
		
		System.out.println("Lojas tabajara");
		while (temProduto) {
			count++;
			System.out.printf("Produto %d: R$ ", count);
			precoAtual = scan.nextDouble();
			
			if (precoAtual <= 0) {
				temProduto = false;
			}
			else {
				total += precoAtual;
			}
		}
		
		System.out.printf("Total: R$ %.2f\n", total);
		System.out.printf("Dinheiro: R$ ");
		
		
		Double dinheiro;
		boolean primeira = true;
		do {
			if (!primeira) {
				System.out.printf("/n ERRO! digite um valor valido: R$ ");
			}
			primeira = false;
			dinheiro = scan.nextDouble();
			
			
		} while (dinheiro < total);
		
		System.out.printf("Troco: R$ %.2f ", dinheiro - total);

		scan.close();
	}

}

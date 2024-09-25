package lista6;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Ex10 {
	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		System.out.println("Escreva a data no formato dd/mm/aaaa:");
		String data = scan.nextLine();
		
		int datas[] = Stream.of(data.split("/")).mapToInt(Integer::parseInt).toArray() ;
		
		System.out.println(dataValida(datas[0], datas[1], datas[2]));
		scan.close();
	}
	
	public static boolean dataValida(int dia, int mes, int ano) {
		List<Integer> dias = Arrays.asList(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31);
		
		boolean bissexto = false;
		if(ano % 400 == 0)
			bissexto = true;
	    else if( (ano % 4 == 0) && (ano % 100 != 0) )
	        bissexto = true;

		if (bissexto && mes == 2 && dia == 29)
			return true;
		
		if (mes <=12 && mes > 0) {
			if(dia > 0 && dia <= dias.get(mes - 1)) {
				return true;
			}
		}
		
		return false;
	}
}

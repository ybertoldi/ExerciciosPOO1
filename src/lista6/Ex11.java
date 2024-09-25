package lista6;

import java.util.ArrayList;
import java.util.List;

public class Ex11 {
	public static void main(String[] args) {
		
	}
	
	public static String[] separa(String texto, char marcacao) {
		List<String> lista = new ArrayList<>();
		
		String atual = "";
		for (char c : texto.toCharArray()) {
			if (c == marcacao) {
				lista.add(atual);
				atual = "";
			}
			else {
				atual += c;
			}
		}
	
		return lista.toArray(new String[0]);		
	}
}

/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Viviane Alves da Silva - 124110445
 */

import java.util.Scanner;

public class crescente {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String resp = "c/d";
		int valor1 = scan.nextInt();
		int valor2 = scan.nextInt();
		int valor3 = scan.nextInt();
		int valor4 = scan.nextInt();
		
		if(valor1 < valor2) {
			if(valor2 < valor3) {
				if(valor3 < valor4) {
					resp = "cres";
				}
			}
		} 
		
		else if (valor1 > valor2) {
			if(valor2 > valor3) {
				if(valor3 > valor4) {
					resp = "decr";
				}
			}
		} 
		
		if (resp.equals("c/d")) {
			System.out.println("FUNCAO NAO ESTRITAMENTE CRES/DECR");
		} else if (resp.equals("cres")) {
			System.out.println("POSSIVELMENTE ESTRITAMENTE CRESCENTE");
		} else if (resp.equals("decr")) {
			System.out.println("POSSIVELMENTE ESTRITAMENTE DECRESCENTE");
		}
		
		
				
	}

}

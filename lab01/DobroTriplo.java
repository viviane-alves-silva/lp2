/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Viviane Alves da Silva - 124110445
 */

import java.util.Scanner;

public class DobroTriplo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int numero = scan.nextInt();

		int dobro = 2 * numero;
		int triplo = 3 * numero;

		System.out.println("dobro: " + dobro + ", triplo: " + triplo);

	}
}

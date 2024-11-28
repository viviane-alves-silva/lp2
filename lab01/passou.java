/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Viviane Alves da Silva - 124110445
 */

import java.util.Scanner;

public class passou {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		
		float nota1 = scan.nextFloat();
		float nota2= scan.nextFloat();
		
		float media = (nota1 + nota2) / 2;
		
		if(media >= 7.0) {
			System.out.println("pass: True!");
		} else {
			System.out.println("pass: False!");
		}
	}

}

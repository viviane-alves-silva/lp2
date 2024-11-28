/**
 * Laboratório de Programação 2 - Lab 1
 * 
 * @author Viviane Alves da Silva - 124110445
 */

import java.util.Scanner;

public class calculadora {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String oper = scan.nextLine();
		
		if (oper.equals("+")) {
			float num1 = scan.nextFloat();
			float num2 = scan.nextFloat();
			float result = num1 + num2;
			System.out.println("RESULTADO: " + result);
		} else if (oper.equals("-")) {
			float num3 = scan.nextFloat();
			float num4 = scan.nextFloat();
			float result = num3 - num4;
			System.out.println("RESULTADO: " + result);
		} else if (oper.equals("*")) {
			float num5 = scan.nextFloat();
			float num6 = scan.nextFloat();
			float result = num5 * num6;
			System.out.println("RESULTADO: " + result);
		} else if (oper.equals("/")) {
			float num7 = scan.nextFloat();
			float num8 = scan.nextFloat();
			if (num8 == 0) {
				System.out.println("ERRO");
			} else if (num7 == 0) {
				System.out.println("ERRO");
			} else {
			
				float result = num7 / num8;
				System.out.println("RESULTADO: " + result);
			}
			
		} else {
			System.out.println("ENTRADA INVALIDA");
		}
		
	}
	
}

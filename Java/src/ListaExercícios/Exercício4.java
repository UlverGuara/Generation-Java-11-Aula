package ListaExerc�cios;

import java.util.Scanner;

/**
 * 4. Escreva um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e
 * calcule a seguinte express�o: D = R + S / 2, onde R = ( A + B )^2 e S = ( B +
 * C )^2
 **/

public class Exerc�cio4 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double numeroA, numeroB, numeroC, valorD;

		System.out.println("Digite o valor de A: ");
		numeroA = ler.nextDouble();
		System.out.println("Digite o valor de B: ");
		numeroB = ler.nextDouble();
		System.out.println("Digite o valor de C: ");
		numeroC = ler.nextDouble();

		valorD = (Math.pow((numeroA + numeroB), 2) + Math.pow((numeroB + numeroC), 2)) / 2;

		System.out.println("\nO valorda express�o D �: " + valorD + ".");

	}

}

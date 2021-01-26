package ListaExercícios;

import java.util.Scanner;

/**
 * 6. Construa um programa em c que, tendo como dados de entrada dois pontos
 * quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A
 * fórmula que efetua tal cálculo é: D = raiz de (X2 - X1)^2 + (Y2 - Y1)^2
 */
public class Exercício6 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double valorX1, valorX2, valorY1, valorY2, planoP = 0;

		System.out.println("Digite o valor de X1");
		valorX1 = ler.nextDouble();
		System.out.println("Digite o valor de X2");
		valorX2 = ler.nextDouble();
		System.out.println("Digite o valor de Y1");
		valorY1 = ler.nextDouble();
		System.out.println("Digite o valor de Y2");
		valorY2 = ler.nextDouble();

		planoP = Math.sqrt(Math.pow((valorX1 - valorX2), 2) + Math.pow((valorY1 - valorY2), 2));

		System.out.println("\nO valor de D é: " + planoP + ".");

	}

}

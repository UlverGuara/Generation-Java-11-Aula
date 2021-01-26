package ListaExercícios;

import java.util.Scanner;

/*7. Um sistema de equações lineares do tipo: 
*	AX + BY = C
*	DX + EY = F
*	pode ser resolvido segundo mostra abaixo:
*		X = CE - BF / AE - BD e Y = AF - CD / AE - BD */

public class Exercício7 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float A, B, C, D, E, F, X, Y;

		System.out.println("Digite o valor de A: ");
		A = ler.nextFloat();
		System.out.println("Digite o valor de B: ");
		B = ler.nextFloat();
		System.out.println("Digite o valor de C: ");
		C = ler.nextFloat();
		System.out.println("Digite o valor de D: ");
		D = ler.nextFloat();
		System.out.println("Digite o valor de E: ");
		E = ler.nextFloat();
		System.out.println("Digite o valor de F: ");
		F = ler.nextFloat();

		X = (C * E - B * F) / (A * E - B * D);
		Y = (A * F - C * D) / (A * E - B * D);

		System.out.println("\nO valor de X é: " + X + " e o valor de Y é: " + Y + ".");

	}

}

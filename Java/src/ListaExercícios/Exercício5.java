package ListaExercícios;

import java.util.Scanner;

//5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. Considerar que a média é ponderada e que o peso das notas é: 2, 3 e 5, respectivamente. 

public class Exercício5 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double notaA, notaB, notaC, media;

		System.out.println("Digite o valor da Primeira Nota: ");
		notaA = ler.nextDouble();
		System.out.println("Digite o valor da Segunda Nota: ");
		notaB = ler.nextDouble();
		System.out.println("Digite o valor da Terceira Nota: ");
		notaC = ler.nextDouble();

		media = (notaA * 2 + notaB * 3 + notaC * 5) / 10;

		System.out.println("\nSua nota final é: " + media + ".");

	}

}

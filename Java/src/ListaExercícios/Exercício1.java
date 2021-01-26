package ListaExercícios;

import java.util.Scanner;

//1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias.

public class Exercício1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idadeAtual, mesDeNascimento, totalMeses, totalDias;

		System.out.println("Digite a sua Idade: ");
		idadeAtual = ler.nextInt();
		System.out.println("Digite o seu Mês de nascimento: ");
		mesDeNascimento = ler.nextInt();

		totalDias = idadeAtual * 365;
		totalMeses = mesDeNascimento * 30;

		System.out.println("\nVocê já viveu :" + totalDias + " dias de vida.");
	}
}

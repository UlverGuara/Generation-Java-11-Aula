package ListaExerc�cios;

import java.util.Scanner;

//1. Fa�a um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias.

public class Exerc�cio1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idadeAtual, mesDeNascimento, totalMeses, totalDias;

		System.out.println("Digite a sua Idade: ");
		idadeAtual = ler.nextInt();
		System.out.println("Digite o seu M�s de nascimento: ");
		mesDeNascimento = ler.nextInt();

		totalDias = idadeAtual * 365;
		totalMeses = mesDeNascimento * 30;

		System.out.println("\nVoc� j� viveu :" + totalDias + " dias de vida.");
	}
}

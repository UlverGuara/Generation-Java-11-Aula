package ListaExercícios;

import java.util.Scanner;

//3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos e mostre-o expresso em horas, minutos e segundos.

public class Exercício3 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int segundos, horas, minutos, restoSegundos;

		System.out.println("Digite a quantidade de Segundo: ");
		segundos = ler.nextInt();

		horas = segundos / 3600;
		minutos = segundos / 60;
		restoSegundos = horas % minutos;

		System.out.println("\nA quantidade digitada equivale a " + horas + " horas, " + minutos + " minutos e "
				+ restoSegundos + " segundos.");

	}

}

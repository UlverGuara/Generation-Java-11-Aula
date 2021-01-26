package ListaExercícios;

import java.util.Scanner;

//2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias. 

public class Exercício2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int dias, anos, meses, restoDias;

		System.out.println("Digite a quantidade de dias: ");
		dias = ler.nextInt();

		anos = dias / 365;
		meses = dias / 30;
		restoDias = anos % meses;

		System.out.println(
				"\nO valor digitado equivale a " + anos + " anos, " + meses + " meses e " + restoDias + " dias.");

	}

}

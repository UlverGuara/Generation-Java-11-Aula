package ListaExercícios;

import java.util.Scanner;

/*8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor e dos impostos (aplicados ao custo de 
*fábrica). Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, escrever um sistema que leia o custo de fábrica de um carro e
*escreva o custo ao consumidor.*/

public class Exercício8 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		float carro, valorDistribuidora, valorImposto, carroNovo;

		System.out.println("Digite o valor do carro: ");
		carro = ler.nextFloat();

		valorDistribuidora = (carro * 28) / 100;
		valorImposto = (carro * 45) / 100;
		carroNovo = valorDistribuidora + valorImposto + carro;

		System.out.println("\nUm carro custa R$:" + carro + " tem R$:" + valorDistribuidora + " de distribuidora, R$:"
				+ valorImposto + " de Imposto e vai custar R$:" + carroNovo + " se for novo.");
	}

}

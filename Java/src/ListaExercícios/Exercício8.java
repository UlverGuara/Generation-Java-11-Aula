package ListaExerc�cios;

import java.util.Scanner;

/*8. O custo ao consumidor de um carro novo � a soma do custo de f�brica com a percentagem do distribuidor e dos impostos (aplicados ao custo de 
*f�brica). Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, escrever um sistema que leia o custo de f�brica de um carro e
*escreva o custo ao consumidor.*/

public class Exerc�cio8 {
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

/* Questão 3. Primeiro foi utilizado o método sort para ordenar o vetor, após foi solicitado a entrada ao usuário e posteriormente feita a verificação se o número consta ou não na lista. */


package questao_3;

import java.util.Arrays;
import java.util.Scanner;

public class BuscaListaOrdenada {
	public static void main(String[] args) {
		int[] numeros = { 2, 3, 7, 9, 11, 8, 4, 1, 0 };
		Arrays.sort(numeros);
		int numeroEscolhido;

		System.out.println("Digite o numero desejado:");

		try (Scanner entrada = new Scanner(System.in)) {
			numeroEscolhido = entrada.nextInt();

			int posicao = java.util.Arrays.binarySearch(numeros, numeroEscolhido);

			if (posicao >= 0) {
				System.out.println("O numero " + numeroEscolhido + " esta na posição " + (posicao + 1));
			} else {
				System.out.println("O numero " + numeroEscolhido + " nao foi encontrado na lista.");
			}

		}
	}
}

/* Questão 3. Primeiro foi utilizado o método sort para ordenar o vetor, após o método getNumeroDigitado recebe a entrada
 * do usuário. O método "buscarNumeroNoArray" verifica a posição do número escolhido no Array já ordenado. 
 * O método "exibirResultado" exibe a posição numero escolhido quando presente na lista */

package questao_3;

import java.util.Arrays;
import java.util.Scanner;

public class BuscaListaOrdenada {

	public static void main(String[] args) {
		int[] numeros = { 2, 3, 7, 9, 11, 8, 4, 1, 0 };
		Arrays.sort(numeros);

		int numeroEscolhido = getNumeroDigitado();
		int indiceNumero = buscarNumeroNoArray(numeroEscolhido, numeros);
		exibirResultado(numeroEscolhido, indiceNumero);
	}

	private static int getNumeroDigitado() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o numero desejado:");
		int numeroDigitado = entrada.nextInt();
		return numeroDigitado;
	}

	private static int buscarNumeroNoArray(int numeroEscolhido, int[] arrayDeNumeros) {
		int indice = java.util.Arrays.binarySearch(arrayDeNumeros, numeroEscolhido);
		return indice;
	}

	private static void exibirResultado(int numeroEscolhido, int indiceNumero) {
		if (indiceNumero >= 0) {
			System.out.println("O numero " + numeroEscolhido + " esta na posição " + (indiceNumero + 1));
			return;
		}

		System.out.println("O numero " + numeroEscolhido + " nao foi encontrado na lista.");
	}

}

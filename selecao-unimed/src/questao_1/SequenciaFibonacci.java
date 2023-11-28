/* Questão 1. Nesta questão foi utilizado o loop no método "getFibonacci" 
 * para obter a sequência até o decimo quinto numero da sequencia */

package questao_1;

public class SequenciaFibonacci {
	public static void main(String[] args) {
		int primeiroNumero = 1;
		int segundoNumero = 0;
		getFibonacci(primeiroNumero, segundoNumero);
	}

	private static int getFibonacci(int primeiroNumero, int segundoNumero) {
		int aux;
		for (int i = 0; i < 15; i++) {
			System.out.println(primeiroNumero);
			aux = primeiroNumero;
			primeiroNumero = primeiroNumero + segundoNumero;
			segundoNumero = aux;
		}
		return primeiroNumero;
	}
}
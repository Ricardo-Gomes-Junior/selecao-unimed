/*  Questão 1. Nesta questão foi utilizado o loop para estabelecer a sequência até o decimo quinto numero */

package questao_1;

public class SequenciaFibonacci {
	public static void main(String[] args) {
		int a = 1;
		int b = 0;
		int aux;

		for (int i = 0; i < 15; i++) {
			System.out.println(a);
			aux = a;
			a = a + b;
			b = aux;
		}
	}
}

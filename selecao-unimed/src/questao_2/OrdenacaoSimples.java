/* Questão 2. Pode-se observar a implementação do método "getOrder", 
 * que atraves do Arrays.sort(lista) ordena a lista corretamente */

package questao_2;

import java.util.Arrays;

public class OrdenacaoSimples {
	public static void main(String[] args) {

		int lista[] = { 3, 2, 5, 8, 1 };
		getOrder(lista);

	}

	private static void getOrder(int lista[]) {
		Arrays.sort(lista);
		System.out.println(Arrays.toString(lista));

	}
}
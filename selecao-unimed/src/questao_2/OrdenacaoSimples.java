/* Questão 2. Pode-se observar a implementação do método sort, tornando o código mais limpo, porem também foi feito manualmente utilizando a ideia do método bubbleSort. */

package questao_2;

import java.util.Arrays;

public class OrdenacaoSimples {
	public static void main(String[] args) {
		int lista[] = { 3, 2, 5, 8, 1 };
//		int aux;
		
		Arrays.sort(lista);

//		for (int i = 0; i < lista.length; i++) {
//			for (int j = 0; j < (lista.length - 1); j++) {
//				if (lista[j] > lista[j + 1]) {
//					aux = lista[j];
//					lista[j] = lista[j + 1];
//					lista[j + 1] = aux;
//				}
//			}
//		}

		System.out.println(Arrays.toString(lista));
	}
}

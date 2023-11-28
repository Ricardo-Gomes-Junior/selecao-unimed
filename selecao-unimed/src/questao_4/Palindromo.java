/* Questão 4. Nesta questão foi utilizado o método "inverterPalavra" e posteriormente o método 
 * "testarPalindromo" para verificar a igualdade */

package questao_4;

public class Palindromo {
	public static void main(String[] args) {
//		String palavra = "teste";
		String palavra = "arara";
		String palavraReversa = inverterPalavra(palavra);
		testarPalindromo(palavra, palavraReversa);

	}

	private static String inverterPalavra(String palavra) {
		String palavraReversa = "";
		for (int i = palavra.length() - 1; i >= 0; i--) {
			palavraReversa = palavraReversa + palavra.charAt(i);
		}
		return palavraReversa;
	}

	private static void testarPalindromo(String palavra, String palavraReversa) {
		boolean palindromo = palavra.equals(palavraReversa);
		System.out.println("A palavra testada é um Palindromo? " + palindromo);
	}
}
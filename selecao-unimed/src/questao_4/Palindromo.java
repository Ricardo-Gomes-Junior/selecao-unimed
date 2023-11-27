/* Questão 4. Nesta questão foi utilizado o método de comparação equals para verificar se a palavra nos dois sentido seria igual. Retornando false ou true. */


package questao_4;

public class Palindromo {
	public static void main(String[] args) {
//		String palavra = "teste";
		String palavra = "arara";

		String palavraReversa = "";

		for (int i = palavra.length() - 1; i >= 0; i--) {
			palavraReversa = palavraReversa + palavra.charAt(i);
		}

		boolean palindromo = palavra.equals(palavraReversa);
		System.out.println("A palavra testada é um Palindromo? " + palindromo);
	}
}

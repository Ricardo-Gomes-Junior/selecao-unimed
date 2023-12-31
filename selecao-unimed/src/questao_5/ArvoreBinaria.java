/* Questão 5. Aplicação da Árvore Binaria, na qual os métodos acrescentam os valores de acordo com seu valor. */


package questao_5;

class No {
	int data;
	No esquerda;
	No direita;

	public No(int data) {
		this.data = data;
		this.esquerda = null;
		this.direita = null;
	}
}

class ArvoreBinaria {
	private No raiz;

	public static void main(String[] args) {
		ArvoreBinaria arvore = new ArvoreBinaria();
		arvore.percorrerEmOrdem();
	}
	
	public ArvoreBinaria() {
		raiz = new No(3);
		raiz.esquerda = new No(2);
		raiz.direita = new No(4);
		raiz.esquerda.esquerda = new No(1);
		raiz.direita.direita = new No(5);
	}

	private void percorrerEmOrdem() {
		System.out.println("Percurso em Ordem:");
		percorrerEmOrdem(raiz);
		System.out.println();
	}

	private void percorrerEmOrdem(No no) {
		if (no != null) {
			percorrerEmOrdem(no.esquerda);
			System.out.print(no.data + " ");
			percorrerEmOrdem(no.direita);
		}
	}

}
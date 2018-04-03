package Default;

import javax.swing.JOptionPane;

public class ListaLigada {

	private No inicio;

	public ListaLigada() {
		JOptionPane.showMessageDialog(null, toString());
	}

	public void adiciona(int novoElemento) {
		No novo = new No(novoElemento);
		if (inicio.prox == null || inicio.prox.dado >= novo.dado) {
			novo.prox = inicio;
			inicio = novo;
		} else {
			
			
			
		}
	}

	public int remove() {
		int r = -1;
		if (inicio == null) {
			System.out.println("Lista vazia!!!");
		} else {
			r = inicio.dado;
			inicio = inicio.prox;
		}
		return r;
	}

	public String toString() {
		No aux = inicio;
		String s = "";
		while (aux != null) {
			s = s + " " + aux.dado;
			aux = aux.prox;
		}
		return s;
	}

}

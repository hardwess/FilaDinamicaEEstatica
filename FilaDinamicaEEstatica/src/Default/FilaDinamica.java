package Default;

import javax.swing.JOptionPane;

import Default.No;

public class FilaDinamica {

	private No inicio;

	public void adiciona(int novoElemento) {
		No aux = inicio;
		while (aux.prox != null) {
			aux = aux.prox;
		}
		aux.prox = new No(novoElemento);
		JOptionPane.showMessageDialog(null, toString());
	}

	public int remove() {
		int r = -1;
		if (inicio == null) {
			System.out.println("Lista vazia!!!");
		} else {
			r = inicio.dado;
			inicio = inicio.prox;
		}
		JOptionPane.showMessageDialog(null, toString());
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

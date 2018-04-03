package Default;

import javax.swing.JOptionPane;

public class FilaEstatica {
	
	private int dados[] = new int[10];
    private int tamanho;
    private int backup;
    
    public FilaEstatica() {
        tamanho = 0;
    }
    
    public boolean cheia() {
        return tamanho == dados.length;
    }

    public boolean vazia() {
        return tamanho == (dados.length - dados.length);
    }
	
    public void adiciona(int e) {
        if (!cheia()) {
            dados[tamanho] = e;
            tamanho++;
            //teste
            for (int z = 0; z < dados.length; z++) {
                System.out.print("[" + dados[z] + "] ");
            }
            System.out.println("");
            //teste
        } else {
            JOptionPane.showMessageDialog(null, "Lista Cheia!", "Alerta", JOptionPane.ERROR_MESSAGE);
        }
    }
	
    public int remove() {
        if (tamanho == 1) {
            backup = dados[dados.length - dados.length];
            dados[0] = 0;
            tamanho--;
            //teste
            for (int z = 0; z < dados.length; z++) {
                System.out.print("[" + dados[z] + "] ");
            }
            System.out.println("");
            //teste
        } else if (vazia()) {
            JOptionPane.showMessageDialog(null, "Lista Vazia!", "Alerta", JOptionPane.ERROR_MESSAGE);
        } else {
            backup = dados[dados.length - dados.length];
            int i = 0;
            while (i < (tamanho - 1)) {
                dados[i] = dados[i + 1];
                dados[i + 1] = 0;
                i++;
            }
            tamanho--;
            //teste
            for (int z = 0; z < 4; z++) {
                System.out.print("[" + dados[z] + "] ");
            }
            System.out.println("");
            //teste
        }
        return backup;
    }
	
}

package Default;

import javax.swing.JOptionPane;

public class Menu {

	public static void main(String[] args) {

		FilaEstatica fe = new FilaEstatica();
		FilaDinamica fd = new FilaDinamica();
		int opcao = 0;

		while (opcao != 9) {
			String option = (JOptionPane.showInputDialog(null,
					"                                    Fila\n\n"
							+ "         Fila Estática:\n\n" + "1 - Adiciona\n"
							+ "2 - Remove\n\n\n" + " Fila Dinâmica \n\n"
							+ "3 - Adiciona\n" + "4 - Remove\n\n" + "9 - Sair"
							+ "\n\n", "", -1));
			try {
				opcao = Integer.parseInt(option);
			} catch (NumberFormatException e) {
				if (option == null) {
					System.exit(0);
				}
				opcao = 0;
			}
			switch (opcao) {
			case 1:
				fe.adiciona(Integer.parseInt(JOptionPane
						.showInputDialog("Insira um valor:")));
				break;
			case 2:
				fe.remove();
				break;
			case 3:
				fd.adiciona(Integer.parseInt(JOptionPane
						.showInputDialog("Insira um valor:")));
				break;
			case 4:
				fd.remove();
				break;
			case 9:
				System.exit(0);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção Inválida", "Alerta",
						JOptionPane.ERROR_MESSAGE);
				break;
			}

		}

	}

}

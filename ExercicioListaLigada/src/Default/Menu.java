package Default;

import javax.swing.JOptionPane;

public class Menu {

	public static void main(String[] args) {

		ListaLigada l = new ListaLigada();

		int opcao = 0;

		while (opcao != 9) {
			String option = (JOptionPane.showInputDialog(null,
					"                                    Lista\n\n"
							+ "         Lista Ligada:\n\n" + "1 - Adiciona\n"
							+ "2 - Remove Inicio \n" + "5 - toString \n\n"
							+ "9 - Sair" + "\n\n", "", -1));
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
				l.adiciona(Integer.parseInt(JOptionPane
						.showInputDialog("Insira um valor:")));
				break;
			case 2:
				l.remove();
				break;
			case 5:
				JOptionPane.showMessageDialog(null, l.toString());
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

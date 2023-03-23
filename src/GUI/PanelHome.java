package GUI;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JTextPane;

public class PanelHome extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelHome() {
		setBackground(new Color(241, 250, 255));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bienvenido!");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel.setBounds(10, 11, 194, 22);
		add(lblNewLabel);
		
		JTextPane txtpnEstaAplicacinDe = new JTextPane();
		txtpnEstaAplicacinDe.setFont(new Font("Tahoma", Font.ITALIC, 14));
		txtpnEstaAplicacinDe.setText("Esta aplicación le facilitara la vida.\r\nCon pocos clicks podra realizar cualquier tipo de conversión.\r\nIngrese la medida o monto, seleccione la unidad base y la unidad final, y la aplicación\r\nle mostrara el resultado!\r\n\r\n\r\n\t\t\t\t\t   \t\t   Desarrollada por: Fabro Jonathan\r\n\t\t  De la mano de: OneOracle - Alura");
		txtpnEstaAplicacinDe.setBounds(143, 125, 384, 184);
		add(txtpnEstaAplicacinDe);

	}
	private static class __Tmp {
		private static void __tmp() {
			  javax.swing.JPanel __wbp_panel = new javax.swing.JPanel();
		}
	}
}

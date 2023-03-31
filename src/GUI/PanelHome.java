package GUI;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JTextPane;
import java.awt.ComponentOrientation;

public class PanelHome extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelHome() {
		setBackground(new Color(241, 250, 255));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bienvenido!");
		lblNewLabel.setFont(new Font("Leelawadee", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel.setBounds(10, 11, 194, 22);
		add(lblNewLabel);
		
		JTextPane txtpnEstaAplicacinDe = new JTextPane();
		txtpnEstaAplicacinDe.setFont(new Font("Leelawadee", Font.ITALIC, 14));
		txtpnEstaAplicacinDe.setText("Esta aplicación le facilitara la vida.\r\nCon pocos clicks podra realizar cualquier tipo de conversión.\r\nIngrese la medida o monto, seleccione la unidad base y la unidad final, y la aplicación\r\nle mostrara el resultado!\r\n");
		txtpnEstaAplicacinDe.setBounds(143, 125, 384, 114);
		add(txtpnEstaAplicacinDe);
		
		JTextPane txtpnDesarrolladaPorFabro = new JTextPane();
		txtpnDesarrolladaPorFabro.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		txtpnDesarrolladaPorFabro.setText("Desarrollada por: Fabro Jonathan\r\nDe la mano de: OneOracle - Alura");
		txtpnDesarrolladaPorFabro.setFont(new Font("Leelawadee", Font.ITALIC, 14));
		txtpnDesarrolladaPorFabro.setBounds(143, 264, 384, 45);
		add(txtpnDesarrolladaPorFabro);

	}
	private static class __Tmp {
		private static void __tmp() {
			  javax.swing.JPanel __wbp_panel = new javax.swing.JPanel();
		}
	}
}

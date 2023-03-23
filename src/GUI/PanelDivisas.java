package GUI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

public class PanelDivisas extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public PanelDivisas() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingrese el monto");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(33, 57, 193, 14);
		add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setColumns(10);
		textField.setBounds(236, 53, 181, 23);
		add(textField);
		
		JComboBox cBoxDivisaBase = new JComboBox();
		cBoxDivisaBase.setBounds(236, 109, 181, 22);
		add(cBoxDivisaBase);
		
		JComboBox cBoxDivisaFinal = new JComboBox();
		cBoxDivisaFinal.setBounds(236, 161, 181, 22);
		add(cBoxDivisaFinal);
		
		JLabel lblNewLabel_2 = new JLabel("Divisa final");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(33, 163, 193, 14);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Divisa base");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(33, 111, 193, 14);
		add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Convertir");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(222, 237, 140, 25);
		add(btnNewButton);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSalir.setBounds(372, 237, 140, 25);
		add(btnSalir);

	}
}

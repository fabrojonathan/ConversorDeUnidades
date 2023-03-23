package GUI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;

public class PanelMasa extends JPanel {
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public PanelMasa() {
		setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textField.setColumns(10);
		textField.setBounds(217, 60, 248, 23);
		add(textField);
		
		JLabel lblIngreseElPeso = new JLabel("Ingrese el peso");
		lblIngreseElPeso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIngreseElPeso.setBounds(70, 61, 137, 17);
		add(lblIngreseElPeso);
		
		JLabel lblNewLabel_1 = new JLabel("Unidad base");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(70, 108, 137, 14);
		add(lblNewLabel_1);
		
		JComboBox cBoxDivisaBase = new JComboBox();
		cBoxDivisaBase.setModel(new DefaultComboBoxModel(new String[] {"Miligramo", "Centigramo", "Decigramo", "Gramo", "Decagramo", "Hectagramo", "Kilogramo"}));
		cBoxDivisaBase.setBounds(217, 106, 248, 22);
		add(cBoxDivisaBase);
		
		JComboBox cBoxDivisaFinal = new JComboBox();
		cBoxDivisaFinal.setModel(new DefaultComboBoxModel(new String[] {"Miligramo", "Centigramo", "Decigramo", "Gramo", "Decagramo", "Hectagramo", "Kilogramo"}));
		cBoxDivisaFinal.setBounds(217, 153, 248, 22);
		add(cBoxDivisaFinal);
		
		JLabel lblNewLabel_2 = new JLabel("Unidad a convertir");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(70, 155, 137, 14);
		add(lblNewLabel_2);
		
		JButton btnConvertir = new JButton("Convertir");
		btnConvertir.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnConvertir.setAlignmentX(0.5f);
		btnConvertir.setBounds(325, 197, 140, 25);
		add(btnConvertir);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new CompoundBorder(null, new BevelBorder(BevelBorder.LOWERED, null, null, null, null)));
		panel.setBackground(new Color(241, 250, 255));
		panel.setBounds(10, 11, 216, 23);
		add(panel);
		
		JLabel lblNewLabel_3_1 = new JLabel("Conversor de Masas");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_3_1.setBounds(10, 0, 206, 23);
		panel.add(lblNewLabel_3_1);
		
		JPanel panelResult = new JPanel();
		panelResult.setLayout(null);
		panelResult.setBorder(null);
		panelResult.setBackground(new Color(160, 172, 189));
		panelResult.setBounds(134, 255, 256, 40);
		add(panelResult);
		
		JLabel txtResult_1 = new JLabel("--");
		txtResult_1.setBounds(0, 0, 256, 40);
		panelResult.add(txtResult_1);
		txtResult_1.setHorizontalAlignment(SwingConstants.CENTER);
		txtResult_1.setFont(new Font("Tahoma", Font.ITALIC, 18));
		txtResult_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));

	}
}

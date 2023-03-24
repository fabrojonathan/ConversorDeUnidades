package GUI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

import Conversor.ConversorDivisas;

import javax.swing.border.CompoundBorder;
import javax.swing.SwingConstants;
import javax.swing.border.MatteBorder;
import java.awt.Component;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.*;

public class PanelDivisas extends JPanel {
	private JTextField txtMonto;

	/**
	 * Create the panel.
	 */
	public PanelDivisas() {
		
		setLayout(null);
		
		JPanel panelResult = new JPanel();
		panelResult.setLayout(null);
		panelResult.setBorder(null);
		panelResult.setBackground(new Color(160, 172, 189));
		panelResult.setBounds(134, 255, 256, 40);
		add(panelResult);
		
		JLabel txtResult = new JLabel("--");
		txtResult.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		txtResult.setBounds(0, 0, 256, 40);
		panelResult.add(txtResult);
		txtResult.setHorizontalAlignment(SwingConstants.CENTER);
		txtResult.setFont(new Font("Tahoma", Font.ITALIC, 18));
		
		JLabel lblNewLabel = new JLabel("Ingrese el monto");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(70, 61, 137, 17);
		add(lblNewLabel);
		
		txtMonto = new JTextField();
		txtMonto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtMonto.setColumns(10);
		txtMonto.setBounds(217, 60, 248, 23);
		add(txtMonto);
		
		JComboBox cBoxDivisaBase = new JComboBox();
		cBoxDivisaBase.setModel(new DefaultComboBoxModel(new String[] {"Pesos", "Dolar", "DolarAustraliano", "Euro", "Libra", "Real", "Yen", "PesoMexicano", "PesoUruguayo", "Yuan"}));
		cBoxDivisaBase.setBounds(217, 106, 248, 22);
		add(cBoxDivisaBase);
		
		JComboBox cBoxDivisaFinal = new JComboBox();
		cBoxDivisaFinal.setModel(new DefaultComboBoxModel(new String[] {"Pesos", "Dolar", "DolarAustraliano", "Euro", "Libra", "Real", "Yen", "PesoMexicano", "PesoUruguayo", "Yuan"}));
		cBoxDivisaFinal.setSelectedIndex(1);
		cBoxDivisaFinal.setBounds(217, 153, 248, 22);
		add(cBoxDivisaFinal);
		
		JLabel lblNewLabel_2 = new JLabel("Divisa final");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(70, 155, 137, 14);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Divisa a convertir");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(70, 108, 137, 14);
		add(lblNewLabel_1);
		
		JButton btnConvertir = new JButton("Convertir");
		btnConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					Double monto = Double.parseDouble(txtMonto.getText());
					int indexBase = cBoxDivisaBase.getSelectedIndex();
					int indexFinal = cBoxDivisaFinal.getSelectedIndex();
					
					ConversorDivisas nConversor = new ConversorDivisas();
					Double resultadoConversion = nConversor.Convertir(indexBase, indexFinal, monto);
					
					DecimalFormat ft = new DecimalFormat("#.##");
					txtResult.setText(ft.format(resultadoConversion).toString());
					
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(btnConvertir, ex);
				}
			}
		});
		btnConvertir.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnConvertir.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnConvertir.setBounds(325, 197, 140, 25);
		add(btnConvertir);
		
		JPanel panel = new JPanel();
		panel.setBorder(new CompoundBorder(null, new BevelBorder(BevelBorder.LOWERED, null, null, null, null)));
		panel.setBackground(new Color(241, 250, 255));
		panel.setBounds(10, 11, 216, 23);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Conversor de Divisas");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setBounds(10, 0, 206, 23);
		panel.add(lblNewLabel_3);

	}
}

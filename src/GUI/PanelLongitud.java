package GUI;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.border.MatteBorder;

import Conversor.ConversorLongitud;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.text.*;

public class PanelLongitud extends JPanel {
	private JTextField txtMedida;

	/**
	 * Create the panel.
	 */
	public PanelLongitud() {
		setLayout(null);
		
		JPanel panelResult = new JPanel();
		panelResult.setLayout(null);
		panelResult.setBorder(null);
		panelResult.setBackground(new Color(160, 172, 189));
		panelResult.setBounds(134, 255, 256, 40);
		add(panelResult);
		
		JLabel txtResult = new JLabel("--");
		txtResult.setHorizontalAlignment(SwingConstants.CENTER);
		txtResult.setFont(new Font("Tahoma", Font.ITALIC, 18));
		txtResult.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		txtResult.setBounds(0, 0, 256, 40);
		panelResult.add(txtResult);
		
		JLabel lblIngreseLaMedida = new JLabel("Ingrese la medida");
		lblIngreseLaMedida.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIngreseLaMedida.setBounds(70, 61, 137, 17);
		add(lblIngreseLaMedida);
		
		txtMedida = new JTextField();
		txtMedida.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtMedida.setColumns(10);
		txtMedida.setBounds(217, 60, 248, 23);
		add(txtMedida);
		
		JComboBox cBoxUnidadBase = new JComboBox();
		cBoxUnidadBase.setModel(new DefaultComboBoxModel(new String[] {"Milimetro", "Centimetro", "Decimetro", "Metro", "Decametro", "Hectometro", "Kilometro"}));
		cBoxUnidadBase.setBounds(217, 106, 248, 22);
		add(cBoxUnidadBase);
		
		JComboBox cBoxUnidadFinal = new JComboBox();
		cBoxUnidadFinal.setModel(new DefaultComboBoxModel(new String[] {"Milimetro", "Centimetro", "Decimetro", "Metro", "Decametro", "Hectometro", "Kilometro"}));
		cBoxUnidadFinal.setSelectedIndex(1);
		cBoxUnidadFinal.setBounds(217, 153, 248, 22);
		add(cBoxUnidadFinal);
		
		JLabel lblNewLabel_2 = new JLabel("Unidad a convertir");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(70, 155, 137, 14);
		add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Unidad base");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(70, 108, 137, 14);
		add(lblNewLabel_1);
		
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new CompoundBorder(null, new BevelBorder(BevelBorder.LOWERED, null, null, null, null)));
		panel.setBackground(new Color(241, 250, 255));
		panel.setBounds(10, 11, 216, 23);
		add(panel);
		
		JLabel lblNewLabel_3 = new JLabel("Conversor de Longitudes");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_3.setBounds(10, 0, 206, 23);
		panel.add(lblNewLabel_3);

		JButton btnConvertir = new JButton("Convertir");
		btnConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					Double medida = Double.parseDouble(txtMedida.getText());
					int indexBase = cBoxUnidadBase.getSelectedIndex();
					int indexFinal = cBoxUnidadFinal.getSelectedIndex();
					
					ConversorLongitud nConversorLongitud = new ConversorLongitud();
					Double resultado = nConversorLongitud.Convertir(indexBase, indexFinal, medida);
					
					DecimalFormat ft = new DecimalFormat("#.##");
					txtResult.setText(ft.format(resultado).toString());
					
				} catch (Exception ex) {
				}
			}
		});
		btnConvertir.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnConvertir.setAlignmentX(0.5f);
		btnConvertir.setBounds(325, 197, 140, 25);
		add(btnConvertir);
		
	}
}

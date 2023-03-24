package GUI;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.MatteBorder;

import Conversor.ConversorTemperatura;
import Data.Temperatura;

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
import javax.swing.ImageIcon;

public class PanelTemperatura extends JPanel {
	private JTextField txtTemperatura;

	/**
	 * Create the panel.
	 */
	public PanelTemperatura() {
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
		
		JLabel lblIngreseLaTemperatura = new JLabel("Ingrese la temperatura");
		lblIngreseLaTemperatura.setHorizontalAlignment(SwingConstants.LEFT);
		lblIngreseLaTemperatura.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIngreseLaTemperatura.setBounds(70, 61, 156, 17);
		add(lblIngreseLaTemperatura);
		
		txtTemperatura = new JTextField();
		txtTemperatura.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtTemperatura.setColumns(10);
		txtTemperatura.setBounds(217, 60, 248, 23);
		add(txtTemperatura);
		
		JComboBox cBoxUnidadBase = new JComboBox();
		cBoxUnidadBase.setModel(new DefaultComboBoxModel(new String[] {"Celsius", "Kelvin", "Farenheit", "Ramkine"}));
		cBoxUnidadBase.setBounds(217, 106, 248, 22);
		add(cBoxUnidadBase);
		
		JComboBox cBoxUnidadFinal = new JComboBox();
		cBoxUnidadFinal.setModel(new DefaultComboBoxModel(new String[] {"Celsius", "Kelvin", "Farenheit", "Ramkine"}));
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
		
		JLabel lblNewLabel_3 = new JLabel("Conversor de Temperaturas");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblNewLabel_3.setBounds(10, 0, 206, 23);
		panel.add(lblNewLabel_3);
		
		JButton btnConvertir = new JButton("Convertir");
		btnConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					Double temperatura = Double.parseDouble(txtTemperatura.getText());
					
					int indexBase = cBoxUnidadBase.getSelectedIndex();
					int indexFinal = cBoxUnidadFinal.getSelectedIndex();
					
					DecimalFormat ft = new DecimalFormat("#.##");
					
					ConversorTemperatura nConversorTemperatura = new ConversorTemperatura();
					Double Resultado = nConversorTemperatura.Convertir(indexBase, indexFinal, temperatura);
					
					txtResult.setText(ft.format(Resultado).toString());
					
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(btnConvertir, e1);
				}
			}
		});
		btnConvertir.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnConvertir.setAlignmentX(0.5f);
		btnConvertir.setBounds(325, 197, 140, 25);
		add(btnConvertir);
		
		JButton btnIntercambiar = new JButton("");
		btnIntercambiar.setIcon(new ImageIcon(PanelTemperatura.class.getResource("/Resources/icons/intercambio.png")));
		btnIntercambiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int indexBaseActual = cBoxUnidadBase.getSelectedIndex();
					int indexFinalActual = cBoxUnidadFinal.getSelectedIndex();
					int indexBaseNueva = indexFinalActual;
					int indexFinalNueva = indexBaseActual;
					
					cBoxUnidadBase.setSelectedIndex(indexBaseNueva);
					cBoxUnidadFinal.setSelectedIndex(indexFinalNueva);
					
					txtResult.setText("--");
					
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(btnIntercambiar, ex);
				}
			}
		});
		btnIntercambiar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnIntercambiar.setAlignmentX(0.5f);
		btnIntercambiar.setBounds(471, 128, 25, 25);
		add(btnIntercambiar);

	}

}

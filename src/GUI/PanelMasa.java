package GUI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.border.MatteBorder;

import Conversor.ConversorMasa;
import Data.Masa;

import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.*;
import javax.swing.ImageIcon;

public class PanelMasa extends JPanel {
	private JTextField txtCantidad;

	/**
	 * Create the panel.
	 */
	public PanelMasa() {
		setLayout(null);
		
		txtCantidad = new JTextField();
		txtCantidad.setFont(new Font("Leelawadee", Font.PLAIN, 14));
		txtCantidad.setColumns(10);
		txtCantidad.setBounds(217, 60, 248, 23);
		add(txtCantidad);
		
		JLabel lblIngreseElPeso = new JLabel("Ingrese el peso");
		lblIngreseElPeso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIngreseElPeso.setBounds(70, 61, 137, 17);
		add(lblIngreseElPeso);
		
		JLabel lblNewLabel_1 = new JLabel("Unidad base");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(70, 108, 137, 14);
		add(lblNewLabel_1);
		
		JComboBox cBoxUnidadBase = new JComboBox();
		cBoxUnidadBase.setFont(new Font("Leelawadee", Font.PLAIN, 14));
		cBoxUnidadBase.setModel(new DefaultComboBoxModel(new String[] {"Miligramo", "Centigramo", "Decigramo", "Gramo", "Decagramo", "Hectagramo", "Kilogramo"}));
		cBoxUnidadBase.setBounds(217, 106, 248, 22);
		add(cBoxUnidadBase);
		
		JComboBox cBoxUnidadFinal = new JComboBox();
		cBoxUnidadFinal.setFont(new Font("Leelawadee", Font.PLAIN, 14));
		cBoxUnidadFinal.setModel(new DefaultComboBoxModel(new String[] {"Miligramo", "Centigramo", "Decigramo", "Gramo", "Decagramo", "Hectagramo", "Kilogramo"}));
		cBoxUnidadFinal.setSelectedIndex(1);
		cBoxUnidadFinal.setBounds(217, 153, 248, 22);
		add(cBoxUnidadFinal);
		
		JLabel lblNewLabel_2 = new JLabel("Unidad a convertir");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(70, 155, 137, 14);
		add(lblNewLabel_2);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new CompoundBorder(null, new BevelBorder(BevelBorder.LOWERED, null, null, null, null)));
		panel.setBackground(new Color(241, 250, 255));
		panel.setBounds(10, 11, 240, 23);
		add(panel);
		
		JLabel lblNewLabel_3_1 = new JLabel("Conversor de Masas");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_3_1.setFont(new Font("Leelawadee", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_3_1.setBounds(10, 0, 230, 23);
		panel.add(lblNewLabel_3_1);
		
		JPanel panelResult = new JPanel();
		panelResult.setLayout(null);
		panelResult.setBorder(null);
		panelResult.setBackground(new Color(160, 172, 189));
		panelResult.setBounds(134, 255, 256, 40);
		add(panelResult);
		
		JLabel txtResult = new JLabel("--");
		txtResult.setBounds(0, 0, 256, 40);
		panelResult.add(txtResult);
		txtResult.setHorizontalAlignment(SwingConstants.CENTER);
		txtResult.setFont(new Font("Leelawadee", Font.BOLD | Font.ITALIC, 18));
		txtResult.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		
		JButton btnConvertir = new JButton("Convertir");
		btnConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					Double Cantidad = Double.parseDouble(txtCantidad.getText());
					Masa UnidadBase = Masa.values()[cBoxUnidadBase.getSelectedIndex()];
					Masa UnidadFinal = Masa.values()[cBoxUnidadFinal.getSelectedIndex()];
					
					ConversorMasa nConversorMasa = new ConversorMasa();
					Double Resultado = nConversorMasa.Convertir(UnidadBase, UnidadFinal, Cantidad);
					
					DecimalFormat ft = new DecimalFormat("#.##");
					txtResult.setText(ft.format(Resultado).toString());
					
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(btnConvertir, ex);
				}
			}
		});
		btnConvertir.setFont(new Font("Leelawadee", Font.BOLD, 14));
		btnConvertir.setAlignmentX(0.5f);
		btnConvertir.setBounds(325, 197, 140, 25);
		add(btnConvertir);
		
		JButton btnIntercambiar = new JButton("");
		btnIntercambiar.setIcon(new ImageIcon(PanelMasa.class.getResource("/Resources/icons/intercambio.png")));
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

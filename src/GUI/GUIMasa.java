package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Conversor.ConversorMasa;

import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class GUIMasa extends JFrame {

	private JPanel contentPane;
	private JTextField txtCantidad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIMasa frame = new GUIMasa();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUIMasa() {
		setTitle("Conversor de Masas");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 600, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtCantidad = new JTextField();
		txtCantidad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtCantidad.setColumns(10);
		txtCantidad.setBounds(298, 91, 181, 23);
		contentPane.add(txtCantidad);
		
		JLabel lblIngreseLaCantidad = new JLabel("Ingrese la cantidad");
		lblIngreseLaCantidad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblIngreseLaCantidad.setBounds(95, 95, 193, 14);
		contentPane.add(lblIngreseLaCantidad);
		
		JLabel lblNewLabel_2 = new JLabel("Medida longitud final");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(95, 201, 193, 14);
		contentPane.add(lblNewLabel_2);
		
		JComboBox cBoxMedidaBase = new JComboBox();
		cBoxMedidaBase.setModel(new DefaultComboBoxModel(new String[] {"Miligramo", "Centigramo", "Decigramo", "Gramo", "Decagramo", "Hectagramo", "Kilogramo"}));
		cBoxMedidaBase.setBounds(298, 147, 181, 22);
		contentPane.add(cBoxMedidaBase);
		
		JComboBox cBoxMedidaFinal = new JComboBox();
		cBoxMedidaFinal.setModel(new DefaultComboBoxModel(new String[] {"Miligramo", "Centigramo", "Decigramo", "Gramo", "Decagramo", "Hectagramo", "Kilogramo"}));
		cBoxMedidaFinal.setBounds(298, 199, 181, 22);
		contentPane.add(cBoxMedidaFinal);
		
		JLabel lblNewLabel_1 = new JLabel("Medida longitud base");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(95, 149, 193, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Convertir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double cantidad = Double.parseDouble(txtCantidad.getText());
				int indexBase = cBoxMedidaBase.getSelectedIndex();
				int indexFinal = cBoxMedidaFinal.getSelectedIndex();
				
				ConversorMasa conversor = new ConversorMasa();
				Double resultado = conversor.Convertir(indexBase, indexFinal, cantidad);
				JOptionPane.showMessageDialog(btnNewButton, resultado);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(284, 275, 140, 25);
		contentPane.add(btnNewButton);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSalir.setBounds(434, 275, 140, 25);
		contentPane.add(btnSalir);
	}

}

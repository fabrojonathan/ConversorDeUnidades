package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Conversor.ConversorDivisas;

import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class GUIDivisas extends JFrame {

	private JPanel contentPane;
	private JTextField txtMonto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIDivisas frame = new GUIDivisas();
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
	public GUIDivisas() {
		setTitle("Conversor de Divisas");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 600, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtMonto = new JTextField();
		txtMonto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtMonto.setBounds(298, 91, 181, 23);
		contentPane.add(txtMonto);
		txtMonto.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Ingrese el monto");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(95, 95, 193, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Divisa base");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(95, 149, 193, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Divisa final");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(95, 201, 193, 14);
		contentPane.add(lblNewLabel_2);
		
		JComboBox cBoxDivisaBase = new JComboBox();
		cBoxDivisaBase.setModel(new DefaultComboBoxModel(new String[] {"Pesos", "Dolar", "DolarAustraliano", "Euro", "Libra", "Real", "Yen", "PesoMexicano", "PesoUruguayo", "Yuan"}));
		cBoxDivisaBase.setBounds(298, 147, 181, 22);
		contentPane.add(cBoxDivisaBase);
		
		JComboBox cBoxDivisaFinal = new JComboBox();
		cBoxDivisaFinal.setModel(new DefaultComboBoxModel(new String[] {"Pesos", "Dolar", "DolarAustraliano", "Euro", "Libra", "Real", "Yen", "PesoMexicano", "PesoUruguayo", "Yuan"}));
		cBoxDivisaFinal.setBounds(298, 199, 181, 22);
		contentPane.add(cBoxDivisaFinal);
		
		JButton btnNewButton = new JButton("Convertir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double monto = Double.parseDouble(txtMonto.getText());
				int indexDivisaBase = cBoxDivisaBase.getSelectedIndex();
				int indexDivisaFinal = cBoxDivisaFinal.getSelectedIndex();
				
				ConversorDivisas conversor = new ConversorDivisas();
				double resultado = conversor.Convertir(indexDivisaBase, indexDivisaFinal, monto);
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

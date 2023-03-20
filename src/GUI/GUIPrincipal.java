package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIPrincipal extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8704030283001688301L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIPrincipal frame = new GUIPrincipal();
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
	public GUIPrincipal() {
		setTitle("Conversor de Unidades");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Selecciones el tipo de conversión ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(75, 98, 203, 40);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Divisas", "Masa","Longitud","Temperatura"}));
		comboBox.setSelectedIndex(0);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 13));
		comboBox.setBounds(284, 108, 203, 22);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("Continuar");

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switch(comboBox.getSelectedIndex()) {
				
				case 0:	//Divisas	
					GUIDivisas formDivisas = new GUIDivisas();
					formDivisas.setVisible(true);
					break;
				
				case 1: //Masa
					GUIMasa formMasa = new GUIMasa();
					formMasa.setVisible(true);
					break;
					
				case 2:	//Longitud
					GUILongitud formLongitud = new GUILongitud();
					formLongitud.setVisible(true);
					break;
				
				case 3:	//Temperatura
					GUITemperatura formTemperatura = new GUITemperatura();
					formTemperatura.setVisible(true);
					break;
				
				default: //No option
					break;
				
				}
			}
		});

		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(272, 275, 140, 25);
		contentPane.add(btnNewButton);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSalir.setBounds(422, 275, 140, 25);
		contentPane.add(btnSalir);
	}
}

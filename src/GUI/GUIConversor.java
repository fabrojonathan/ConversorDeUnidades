package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JButton;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Insets;
import java.awt.CardLayout;

public class GUIConversor extends JFrame {

	private JPanel contentGeneral;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIConversor frame = new GUIConversor();
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
	public GUIConversor() {
		setUndecorated(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 350);
		contentGeneral = new JPanel();
		contentGeneral.setBackground(new Color(241, 250, 255));
		contentGeneral.setBorder(new LineBorder(new Color(111, 148, 188)));

		setContentPane(contentGeneral);
		contentGeneral.setLayout(null);
		
		JPanel panelSecondaryBar = new JPanel();
		panelSecondaryBar.setBorder(new LineBorder(new Color(60, 72, 86)));
		panelSecondaryBar.setBackground(new Color(60, 72, 86));
		panelSecondaryBar.setBounds(0, 0, 600, 30);
		contentGeneral.add(panelSecondaryBar);
		panelSecondaryBar.setLayout(null);
		
		JPanel panelClose = new JPanel();
		panelClose.setBorder(new LineBorder(Color.BLACK));
		panelClose.setBounds(570, 0, 30, 30);
		panelSecondaryBar.add(panelClose);
		panelClose.setLayout(null);
		
		JButton btnClose = new JButton("");
		btnClose.setBackground(new Color(160, 172, 189));
		btnClose.setIcon(new ImageIcon(GUIConversor.class.getResource("/Resources/icons/cruz-pequena.png")));
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(EXIT_ON_CLOSE);
			}
		});
		btnClose.setBounds(0, 0, 30, 30);
		panelClose.add(btnClose);
		
		JPanel panelMinimize = new JPanel();
		panelMinimize.setBounds(541, 0, 30, 30);
		panelSecondaryBar.add(panelMinimize);
		panelMinimize.setBorder(new LineBorder(Color.BLACK));
		panelMinimize.setLayout(null);
		
		JButton btnMinimize = new JButton("");
		btnMinimize.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setExtendedState(1);
			}
		});
		btnMinimize.setBackground(new Color(160, 172, 189));
		btnMinimize.setMargin(new Insets(2, 20, 2, 20));
		btnMinimize.setIcon(new ImageIcon(GUIConversor.class.getResource("/Resources/icons/menos.png")));
		btnMinimize.setCursor(Cursor.getPredefinedCursor(Cursor.N_RESIZE_CURSOR));
		btnMinimize.setBounds(0, 0, 30, 30);
		panelMinimize.add(btnMinimize);
		
		JPanel panelMenuBar = new JPanel();
		panelMenuBar.setBackground(new Color(111, 148, 188));
		panelMenuBar.setBounds(0, 30, 64, 320);
		contentGeneral.add(panelMenuBar);
		panelMenuBar.setLayout(null);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PanelDivisas nPanelHome = new PanelDivisas();
				nPanelHome.setSize(535, 319);
				nPanelHome.setLocation(63,30);
				
				contentGeneral.add(nPanelHome);
				contentGeneral.repaint();
				contentGeneral.revalidate();
			}
		});
		btnNewButton.setBounds(0, 0, 64, 64);
		panelMenuBar.add(btnNewButton);
		btnNewButton.setIcon(new ImageIcon(GUIConversor.class.getResource("/Resources/icons/casa.png")));
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setIcon(new ImageIcon(GUIConversor.class.getResource("/Resources/icons/cambio-de-dinero.png")));
		btnNewButton_1.setBounds(0, 64, 64, 64);
		panelMenuBar.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.setIcon(new ImageIcon(GUIConversor.class.getResource("/Resources/icons/escala-de-peso.png")));
		btnNewButton_1_1.setBounds(0, 128, 64, 64);
		panelMenuBar.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("");
		btnNewButton_1_1_1.setIcon(new ImageIcon(GUIConversor.class.getResource("/Resources/icons/alta-temperatura.png")));
		btnNewButton_1_1_1.setBounds(0, 192, 64, 64);
		panelMenuBar.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1_1_1 = new JButton("");
		btnNewButton_1_1_1_1.setIcon(new ImageIcon(GUIConversor.class.getResource("/Resources/icons/regla-cuadrada.png")));
		btnNewButton_1_1_1_1.setBounds(0, 256, 64, 64);
		panelMenuBar.add(btnNewButton_1_1_1_1);
	}
}

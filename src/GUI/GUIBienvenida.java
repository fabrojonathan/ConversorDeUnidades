package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JProgressBar;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.SwingConstants;

public class GUIBienvenida extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIBienvenida frame = new GUIBienvenida();
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
	public GUIBienvenida() {
		setLocationByPlatform(true);
		setUndecorated(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1_1 = new JLabel("Conversor de Unidades");
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_1_1.setBounds(10, 11, 205, 25);
		contentPane.add(lblNewLabel_1_1);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBackground(SystemColor.scrollbar);
		progressBar.setStringPainted(true);
		progressBar.setForeground(Color.DARK_GRAY);
		progressBar.setBounds(538, 364, 252, 25);
		contentPane.add(progressBar);
		
		JLabel lblNewLabel_1 = new JLabel("By Fabro Jonathan - Alura - OneOracle");
		lblNewLabel_1.setBounds(10, 363, 252, 25);
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1.setBackground(SystemColor.scrollbar);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBorder(null);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblNewLabel_1.setForeground(SystemColor.textHighlight);
		
		JPanel panel = new JPanel();
		panel.setForeground(SystemColor.activeCaptionBorder);
		panel.setBackground(SystemColor.controlHighlight);
		panel.setBounds(10, 364, 252, 25);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(UIManager.getColor("FormattedTextField.selectionBackground"));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\jonhf\\eclipse-workspace\\ConversorDeUnidades\\src\\Resources\\wallpaperbetter.com_1024x600.jpg"));
		lblNewLabel.setBounds(0, 0, 800, 400);
		contentPane.add(lblNewLabel);
		
		 Thread thread = new Thread(() -> {
	            for (int i = 0; i <= 100; i++) {
	                try {
	                    Thread.sleep(35);
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	                progressBar.setValue(i);
	            }
	        });
	     thread.start();
	}
}

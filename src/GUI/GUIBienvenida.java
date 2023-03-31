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
		lblNewLabel_1_1.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 15));
		lblNewLabel_1_1.setBounds(10, 11, 358, 25);
		contentPane.add(lblNewLabel_1_1);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBackground(SystemColor.scrollbar);
		progressBar.setStringPainted(true);
		progressBar.setForeground(Color.DARK_GRAY);
		progressBar.setBounds(538, 364, 252, 25);
		contentPane.add(progressBar);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBackground(UIManager.getColor("FormattedTextField.selectionBackground"));
		lblNewLabel.setIcon(new ImageIcon(GUIBienvenida.class.getResource("/Resources/wallpaperbetter.com_1024x600.jpg")));
		lblNewLabel.setBounds(0, 0, 800, 400);
		contentPane.add(lblNewLabel);
		
		 Thread thread = new Thread(() -> {
	            for (int i = 0; i <= 100; i++) {
	                try {
	                    Thread.sleep(30);
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	                progressBar.setValue(i);
	            }
	        });
	     thread.start();
	}
}

package GUI;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;

public class PanelHome extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelHome() {
		setBackground(new Color(241, 250, 255));
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Bienvenido!!");
		lblNewLabel.setBounds(246, 121, 194, 22);
		add(lblNewLabel);

	}
}

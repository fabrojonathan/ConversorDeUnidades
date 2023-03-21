import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

import GUI.GUIBienvenida;
import GUI.GUIPrincipal;

public class Main {

	public static void main(String[] args) {
		
		GUIBienvenida nBienvenida = new GUIBienvenida();
		nBienvenida.setLocationRelativeTo(null);
		nBienvenida.setVisible(true);
		GUIPrincipal nGUIPrincipal = new GUIPrincipal();
		nGUIPrincipal.setLocationRelativeTo(null);
		
		Timer timer = new Timer(4000,new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                nBienvenida.setVisible(false);
                nGUIPrincipal.setVisible(true);
        }});
		
		timer.start();
	}

}

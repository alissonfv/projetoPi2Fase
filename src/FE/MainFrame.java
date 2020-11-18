package FE;

import javax.swing.JFrame;

// TODO: SUGESTÂO - Usar essa como frame principal e criar aqui os cardsPanels - Usar as outras como Panel

public class MainFrame extends JFrame {

    public MainFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

	public void draw() {
        pack();        
        setLocationRelativeTo(null);
        setVisible(true);
	}

}

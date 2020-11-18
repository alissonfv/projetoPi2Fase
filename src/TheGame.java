import javax.swing.SwingUtilities;

import FE.MainFrame;

public class TheGame {

  public static void main(String[] args) {

    SwingUtilities.invokeLater(new Runnable() {
      @Override
      public void run() {
        MainFrame frame = new MainFrame();
        frame.draw();
      }
    });
    
  }
}

package FE;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HomeFrame extends JFrame {

  public HomeFrame() {
    super("The Game");
    setMinimumSize(new Dimension(1200, 800));
    init();
  }

  private void init() {

    setLayout(new BorderLayout());

    JPanel panel;
    JPanel panelbt;
    JButton btnCreaterQuestions;
    JButton btnReadQuestions;

    panel = new JPanel();
    panel.setBackground(new Color(0, 238, 224));
    panel.setPreferredSize(new Dimension(200, 150));
    add(panel, BorderLayout.NORTH);

    panel = new JPanel();
    panel.setBackground(new Color(0, 238, 224));
    panel.setPreferredSize(new Dimension(200, 150));
    add(panel, BorderLayout.SOUTH);

    panel = new JPanel();
    panel.setBackground(new Color(0, 238, 224));
    panel.setPreferredSize(new Dimension(350, 100));
    panel.setLayout(new FlowLayout());

    add(panel, BorderLayout.WEST);
    panel = new JPanel();
    panel.setBackground(new Color(0, 238, 224));
    panel.setPreferredSize(new Dimension(250, 100));
    panel.setLayout(new FlowLayout());
    add(panel, BorderLayout.EAST);

    panelbt = new JPanel();
    panel.setPreferredSize(new Dimension(350, 40));
    panelbt.setLayout(new GridLayout(4, 1, 5, 10));
    panelbt.setBackground(new Color(0, 238, 224));

    btnCreaterQuestions = new JButton("Criar Questões");
    btnCreaterQuestions.addActionListener(new EventClickButtom());
    btnCreaterQuestions.setFont(new Font("TimesRoman", 1, 24));
    btnCreaterQuestions.setForeground(new Color(5, 255, 90));
    btnCreaterQuestions.setRolloverEnabled(false);
    panelbt.add(btnCreaterQuestions);

    btnReadQuestions = new JButton("Ver Questões");
    btnReadQuestions.addActionListener(new EventClickButtom());
    btnReadQuestions.setFont(new Font("TimesRoman", 1, 24));
    btnReadQuestions.setForeground(new Color(5, 255, 90));
    btnReadQuestions.setBackground(Color.WHITE);
    btnReadQuestions.setRolloverEnabled(false);
    panelbt.add(btnReadQuestions);

    add(panelbt, BorderLayout.CENTER);

  }

  private class EventClickButtom implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

      if (actionEvent.getActionCommand().equals("Criar Questões")) {
        System.out.println("tesste");
        JFrame frame = null;
        frame = new CreatQuestFront();
        frame.setVisible(true);
      }
      if (actionEvent.getActionCommand().equals("Ver Questões")) {
        System.out.println("tesste");
        JFrame frame= null;
        frame = new HomeFrame();
        frame.setContentPane(new QuestionPanel(frame));
        frame.setVisible(true);
      }
    }
  }
}

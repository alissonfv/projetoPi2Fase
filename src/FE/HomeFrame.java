package FE;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HomeFrame extends JFrame {

  public HomeFrame() {
    super("Demo Panel");
    setExtendedState(MAXIMIZED_BOTH);
    init();
  }

  private void init() {
    setLayout(new BorderLayout());

    JPanel panel;
    JPanel panelbt;
    JButton btnCreaterQuestions;
    JButton btnUpdateQuestions;
    JButton btnReadQuestions;
    JButton btnDeleteQuestions;
    JButton btnAnswerQuestions;

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
    panel.setPreferredSize(new Dimension(400, 50));
    panelbt.setLayout(new GridLayout(5, 1, 5, 10));

    btnCreaterQuestions = new JButton("Criar Quest�es");
    btnCreaterQuestions.setFont(new Font("TimesRoman", 1, 24));
    btnCreaterQuestions.setForeground(new Color(5, 255, 90));
    btnCreaterQuestions.setBackground(Color.WHITE);
    btnCreaterQuestions
        .setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 238, 224), 0));
    btnCreaterQuestions.setRolloverEnabled(false);
    panelbt.add(btnCreaterQuestions);

    panelbt.setBackground(new Color(0, 238, 224));
    btnUpdateQuestions = new JButton("Alterar Quest�es");
    btnUpdateQuestions.setFont(new Font("TimesRoman", 1, 24));
    btnUpdateQuestions.setForeground(new Color(5, 255, 90));
    btnUpdateQuestions.setBackground(Color.WHITE);
    btnUpdateQuestions
        .setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 238, 224), 0));
    btnUpdateQuestions.setRolloverEnabled(false);
    btnUpdateQuestions.setMargin(new Insets(10, 1000, 20, 14));
    btnUpdateQuestions.setBounds(0, 10, 130, 27);
    panelbt.add(btnUpdateQuestions);

    btnReadQuestions = new JButton("Ver Quest�es");
    btnReadQuestions.setFont(new Font("TimesRoman", 1, 24));
    btnReadQuestions.setForeground(new Color(5, 255, 90));
    btnReadQuestions.setBackground(Color.WHITE);
    btnReadQuestions
        .setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 238, 224), 0));
    btnReadQuestions.setRolloverEnabled(false);
    panelbt.add(btnReadQuestions);

    add(panelbt, BorderLayout.CENTER);
    btnAnswerQuestions = new JButton("Responder Quest�es");
    btnAnswerQuestions.setFont(new Font("TimesRoman", 1, 24));
    btnAnswerQuestions.setForeground(new Color(5, 255, 90));
    btnAnswerQuestions.setBackground(Color.WHITE);
    btnAnswerQuestions
        .setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 238, 224), 0));
    btnAnswerQuestions.setRolloverEnabled(false);
    panelbt.add(btnAnswerQuestions);
    add(panelbt, BorderLayout.CENTER);

    add(panelbt, BorderLayout.CENTER);
    btnDeleteQuestions = new JButton("Deletar Quest�es");
    btnDeleteQuestions.setFont(new Font("TimesRoman", 1, 24));
    btnDeleteQuestions.setForeground(new Color(5, 255, 90));
    btnDeleteQuestions.setBackground(Color.WHITE);
    btnDeleteQuestions
        .setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 238, 224), 0));
    btnDeleteQuestions.setRolloverEnabled(false);
    panelbt.add(btnDeleteQuestions);

    add(panelbt, BorderLayout.CENTER);
  }
}

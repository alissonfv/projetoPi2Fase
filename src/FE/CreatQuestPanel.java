package FE;

import BE.domain.Question;
import BE.services.QuestionService;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;

public class CreatQuestPanel extends JPanel {

  private static final Insets FIELD_INSETS = new Insets(5, 10, 0, 0);
  private static final int NUM_RADIOBTN = 5;

  private MainFrame frame;
  private Question question;
  private JButton deletebtn;
  private JButton creatbtn;
  private JTextField textFieldQuestion;
  private JTextField textFieldA;
  private JTextField textFieldB;
  private JTextField textFieldC;
  private JTextField textFieldD;
  private JTextField textFieldE;
  private GridBagLayout layout;
  private GridBagConstraints constraints;
  private JCheckBox checkBoxA;
  private JCheckBox checkBoxB;
  private JCheckBox checkBoxC;
  private JCheckBox checkBoxD;
  private JCheckBox checkBoxE;
  private JLabel labelR;

  public CreatQuestPanel(MainFrame frame) {
    this.frame = frame;
    JPanel contentPane = new JPanel();
    contentPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
    contentPane.setBackground(Color.CYAN);
    this.question = null;
    addComponentListener(new ComponentAdapter() {
      @Override
      public void componentShown(ComponentEvent arg0) {
        if (question == null) {
          textFieldQuestion.setText("");
          textFieldA.setText("");
          textFieldB.setText("");
          textFieldC.setText("");
          textFieldD.setText("");
          textFieldE.setText("");
        } else {
          textFieldQuestion.setText(question.getQuestion());
        }
      }
    });
    // setContentPane(contentPane);
    setSize(1000, 650);
    layout = new GridBagLayout();
    setLayout(layout);

    constraints = new GridBagConstraints();

    init();
  }

  private void init() {
    ActionEventHandler handler = new ActionEventHandler();
    JLabel label;
    JSeparator separator;
    JPanel panel;
    JCheckBox checkBoxBtn;

    /**
     * Componentes de texto
     */
    label = new JLabel("NOVA QUESTÃO");
    addComponent(label, 0, 2, 1, 1);
    separator = new JSeparator();
    addComponent(separator, 2, 1, 3, 1);

    label = new JLabel("Questão: ");
    label.setForeground(Color.BLACK);
    addComponent(label, 2, 2, 1, 1);
    textFieldQuestion = new JTextField(2);
    addComponent(textFieldQuestion, 3, 1, 3, 1);

    /** Alternativas */
    label = new JLabel("Alternativas: ");
    label.setForeground(Color.BLACK);
    addComponent(label, 4, 2, 1, 1);
    labelR = new JLabel("Questão Correta:");
    addComponent(labelR, 4, 4, 1, 1);
    ButtonGroup buttonGroup = new ButtonGroup();

    /** Alternativa 1 */
    label = new JLabel("1) ");
    label.setForeground(Color.BLACK);
    addComponent(label, 5, 1, 1, 1);
    textFieldA = new JTextField(30);
    addComponent(textFieldA, 5, 2, 2, 1);
    checkBoxA = new JCheckBox();
    buttonGroup.add(checkBoxA);
    addComponent(checkBoxA, 5, 4, 1, 1);

    /** Alternativa 2 */
    label = new JLabel("2) ");
    label.setForeground(Color.BLACK);
    addComponent(label, 6, 1, 1, 1);
    textFieldB = new JTextField(2);
    addComponent(textFieldB, 6, 2, 2, 1);
    checkBoxB = new JCheckBox();
    buttonGroup.add(checkBoxB);
    addComponent(checkBoxB, 6, 4, 1, 1);

    /** Alternativa 3 */
    label = new JLabel("3) ");
    label.setForeground(Color.BLACK);
    addComponent(label, 7, 1, 1, 1);
    textFieldC = new JTextField(2);
    addComponent(textFieldC, 7, 2, 2, 1);
    checkBoxC = new JCheckBox();
    buttonGroup.add(checkBoxC);
    addComponent(checkBoxC, 7, 4, 1, 1);

    /** Alternativa 4 */
    label = new JLabel("4) ");
    label.setForeground(Color.BLACK);
    addComponent(label, 8, 1, 1, 1);
    textFieldD = new JTextField(2);
    addComponent(textFieldD, 8, 2, 2, 1);
    checkBoxD = new JCheckBox();
    buttonGroup.add(checkBoxD);
    addComponent(checkBoxD, 8, 4, 1, 1);
    

    /** Alternativa 5 */
    label = new JLabel("5) ");
    label.setForeground(Color.BLACK);
    addComponent(label, 9, 1, 1, 1);
    textFieldE = new JTextField(2);
    addComponent(textFieldE, 9, 2, 2, 1);
    checkBoxE = new JCheckBox();
    buttonGroup.add(checkBoxE);
    addComponent(checkBoxE, 9, 4, 1, 1);



    /**
     * Componentes de Botão
     */

    label = new JLabel();
    addComponent(label, 11, 0, 1, 1);
    creatbtn = new JButton("Criar");
    creatbtn.addActionListener(handler);
    addComponent(creatbtn, 11, 2, 1, 1);

    deletebtn = new JButton("Cancelar");
    deletebtn.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent arg0) {
        frame.showQuestionPanel();
      }
    });
    addComponent(deletebtn, 11, 3, 1, 1);

   
    

  }

  private void addListenerInBtn(JCheckBox checkBox){
    checkBox.addItemListener(new ItemListener() {
      @Override
      public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
          System.out.println("Item selecionado");
        }
      }
    });
  };

  public void setQuestion(Question question) {
    this.question = question;
  }

  private void addComponent(JComponent comp, int row, int col, int width, int height) {
    constraints.gridx = col;
    constraints.gridy = row;
    constraints.gridwidth = width;
    constraints.gridheight = height;

    constraints.fill = GridBagConstraints.HORIZONTAL;
    constraints.insets = FIELD_INSETS;
    constraints.anchor = GridBagConstraints.NORTHWEST;

    layout.setConstraints(comp, constraints);
    add(comp);
  }

  private class ActionEventHandler implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent event) {

      if (event.getSource() == creatbtn) {

        if (!textFieldQuestion.getText().isEmpty() & !textFieldA.getText().isEmpty() & !textFieldB.getText().isEmpty()
            & !textFieldC.getText().isEmpty() & !textFieldD.getText().isEmpty() & !textFieldE.getText().isEmpty()) {
          Question quest = new Question("1", textFieldQuestion.getText());
          if (question == null) {
            // TODO FAZER A VALIDÇÃO DO RADIONBUTON
            QuestionService.createQuestion(quest);
            JOptionPane.showMessageDialog(CreatQuestPanel.this, "Questão criado com sucesso!", "The Game",
                JOptionPane.INFORMATION_MESSAGE);
          } else {
            quest.setId(question.getId());
            QuestionService.updateQuestion(question);
            JOptionPane.showMessageDialog(CreatQuestPanel.this, "Questão Alterada com sucesso!", "The Game",
                JOptionPane.INFORMATION_MESSAGE);
          }
        } else {
          JOptionPane.showMessageDialog(CreatQuestPanel.this, "Preencha todos os campos", "Erro ao criar questão",
              JOptionPane.INFORMATION_MESSAGE);
        }
        frame.showQuestionPanel();
      }
    }
  } // fim da classe ActionEventHandler
} // fim da classe ActionEventFrame

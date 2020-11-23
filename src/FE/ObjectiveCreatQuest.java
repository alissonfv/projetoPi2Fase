package FE;

import BE.domain.Question;
import BE.services.QuestionService;

import java.awt.Color;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentAdapter;

import javax.swing.*;

public class ObjectiveCreatQuest extends FormQuestionPanel {

  private static final Insets FIELD_INSETS = new Insets(5, 10, 0, 0);

  private Question question;
  private JTextArea questionTxt;
  private JTextField textFieldA;
  private JTextField textFieldB;
  private JTextField textFieldC;

  private JTextField typeQuestionTxt;
  private JCheckBox checkBoxATrue;
  private JCheckBox checkBoxAFalse;
  private JCheckBox checkBoxBTrue;
  private JCheckBox checkBoxBFalse;
  private JCheckBox checkBoxCFalse;
  private JCheckBox checkBoxCTrue;

  private JButton saveBtn;

  public ObjectiveCreatQuest(MainFrame frame) {

    super(frame);
    this.question = null;
    addComponentListener(new ComponentAdapter() {
      @Override
      public void componentShown(ComponentEvent arg0) {
        if (question == null) {
          questionTxt.setText("");
          textFieldA.setText("");
          textFieldB.setText("");
          textFieldC.setText("");
        } else {
          questionTxt.setText(question.getQuestion());
        }
      }
    });
  }

  private void createAlternatives() {
    // ActionEventHandler handler = new ActionEventHandler();
    JLabel label;

    label = new JLabel("Alternativas: ");
    label.setForeground(Color.BLACK);
    addComponent(label, 7, 0, 1, 1);
    label = new JLabel("V");
    addComponent(label, 7, 2, 1, 1);
    label = new JLabel("F");
    addComponent(label, 7, 3, 1, 1);
    ButtonGroup btnGroupAltA = new ButtonGroup();
    ButtonGroup btnGroupAltB = new ButtonGroup();
    ButtonGroup btnGroupAltC = new ButtonGroup();

    label = new JLabel("1) ");
    label.setForeground(Color.BLACK);
    addComponent(label, 8, 0);
    textFieldA = new JTextField(1);
    addComponent(textFieldA, 8, 1);

    checkBoxATrue = new JCheckBox();
    btnGroupAltA.add(checkBoxATrue);
    addComponent(checkBoxATrue, 8, 2);

    checkBoxAFalse = new JCheckBox();
    btnGroupAltA.add(checkBoxAFalse);
    addComponent(checkBoxAFalse, 8, 3);

    label = new JLabel("2) ");
    label.setForeground(Color.BLACK);
    addComponent(label, 9, 0);
    textFieldB = new JTextField(1);
    addComponent(textFieldB, 9, 1);

    checkBoxBTrue = new JCheckBox();
    btnGroupAltB.add(checkBoxBTrue);
    addComponent(checkBoxBTrue, 9, 2);

    checkBoxBFalse = new JCheckBox();
    btnGroupAltB.add(checkBoxBFalse);
    addComponent(checkBoxBFalse, 9, 3);

    label = new JLabel("3) ");
    label.setForeground(Color.BLACK);
    addComponent(label, 10, 0);
    textFieldC = new JTextField(1);
    addComponent(textFieldC, 10, 1);

    checkBoxCTrue = new JCheckBox();
    btnGroupAltC.add(checkBoxCTrue);
    addComponent(checkBoxCTrue, 10, 2);

    checkBoxCFalse = new JCheckBox();
    btnGroupAltC.add(checkBoxCFalse);
    addComponent(checkBoxCFalse, 10, 3);

    /*
     * addListenerInBtn(checkBoxA); addListenerInBtn(checkBoxB);
     * addListenerInBtn(checkBoxC); addListenerInBtn(checkBoxD);
     * addListenerInBtn(checkBoxE);
     */
    label = new JLabel();
    addComponent(label, 14, 0, 1, 1);

  }

  /*
   * private void addListenerInBtn(JCheckBox checkBox) {
   * checkBox.addItemListener(new ItemListener() {
   * 
   * @Override public void itemStateChanged(ItemEvent e) { if (e.getStateChange()
   * == ItemEvent.SELECTED) { System.out.println("Item selecionado"); } } }); };
   */
  public void setQuestion(Question question) {
    this.question = question;
  }

  @Override
  public void createTypeQuestionComponent() {
    JLabel label;
    label = new JLabel("Tipo da Questão");
    addComponent(label, 1, 0);
    typeQuestionTxt = new JTextField(1);
    typeQuestionTxt.setEditable(false);
    addComponent(typeQuestionTxt, 1, 1);

    createAlternatives();
  }

  @Override
  public void createSaveButton() {
    saveBtn = new JButton("Salvar");
    saveBtn.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent arg0) {
        if (!getQuestionTxt().getText().isEmpty() & !textFieldA.getText().isEmpty() & !textFieldB.getText().isEmpty()
            & !textFieldC.getText().isEmpty()) {
          Question quest = new Question(getQuestionTxt().getText());
          if (question == null) {
            // TODO FAZER A VALIDÇÃO DO RADIONBUTON
            QuestionService.createQuestion(quest);
            JOptionPane.showMessageDialog(ObjectiveCreatQuest.this, "Questão criado com sucesso!", "The Game",
                JOptionPane.INFORMATION_MESSAGE);
            getFrame().showQuestionPanel();
          } else {
            quest.setId(question.getId());
            QuestionService.updateQuestion(question);
            JOptionPane.showMessageDialog(ObjectiveCreatQuest.this, "Questão Alterada com sucesso!", "The Game",
                JOptionPane.INFORMATION_MESSAGE);
            getFrame().showQuestionPanel();

          }
        } else {
          JOptionPane.showMessageDialog(ObjectiveCreatQuest.this, "Preencha todos os campos", "Erro ao criar questão",
              JOptionPane.INFORMATION_MESSAGE);
        }
      }
    });
    setSaveBtn(saveBtn);
  }
}

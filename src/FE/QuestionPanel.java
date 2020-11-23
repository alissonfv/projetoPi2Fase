package FE;

import BE.domain.Question;
import BE.services.QuestionService;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class QuestionPanel extends JPanel {

  MainFrame frame;
  QuestionTableModel tableModel;

  private JButton btnCreate;
  private JButton btnChange;
  private JButton btnRemove;

  private JTable tableQuestions;

  public QuestionPanel(MainFrame frame) {
    this.frame = frame;

    setLayout(new BorderLayout(10, 10));

    createBtns();
    createTable();
  }

  public void reload(){
    tableModel.load(QuestionService.getQuestions());
  }

  private void createTable() {
    tableModel = new QuestionTableModel(QuestionService.getQuestions());
    tableQuestions = new JTable(tableModel);
    tableQuestions.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);//uma linha de cada vez

    tableQuestions.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
      @Override
      public void valueChanged(ListSelectionEvent event) {
        if (!event.getValueIsAdjusting()) {
          if (tableQuestions.getSelectedRow() >= 0) {
            ablebtns();
          } else {
            disableBtns();
          }
        }
      }

    });

    

    JScrollPane scroll = new JScrollPane(tableQuestions);

    add(scroll, BorderLayout.CENTER);
  }

  private void createBtns() {
    JPanel panelBtn = new JPanel();
    FlowLayout layout = (FlowLayout) panelBtn.getLayout();
    layout.setAlignment(FlowLayout.RIGHT);

    btnCreate = new JButton("Adicionar");

    btnCreate.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent event) {
        frame.showObjectiveCreatQuest(null);
      }
    });

    panelBtn.add(btnCreate);

    btnChange = new JButton("Alterar");

    panelBtn.add(btnChange);

    btnChange.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent event) {
        frame.showObjectiveCreatQuest(tableModel.getQuestion(tableQuestions.getSelectedRow()));
      }
    });

    panelBtn.add(btnChange);

    btnRemove = new JButton("Remover");

    btnRemove.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent arg0) {
        Question quest = tableModel.getQuestion(tableQuestions.getSelectedRow());
        int answer = JOptionPane.showConfirmDialog(QuestionPanel.this, "Você deseja remover essa tarefa ?", "The Game", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE) ;
        if(answer == JOptionPane.YES_OPTION){
          QuestionService.deleteQuestion(quest);
          tableModel.delete(quest);
        }
      }
    });

    panelBtn.add(btnRemove);

    add(panelBtn, BorderLayout.NORTH);

  }

  private void disableBtns() {
    btnChange.setEnabled(false);
    btnRemove.setEnabled(false);
  }

  private void ablebtns() {
    btnChange.setEnabled(true);
    btnRemove.setEnabled(true);
  }
}

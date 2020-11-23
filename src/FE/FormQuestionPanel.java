package FE;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridBagConstraints;

public abstract class FormQuestionPanel extends JPanel {

    private JTextArea questionTxt;
    private JTextField idTxt;
    private JButton saveBtn;
    private JButton cancelBtn;
    private MainFrame frame;
    private GridBagLayout layout;
    private GridBagConstraints constraints;
    private static Insets FIELD_INSETS = new Insets(5,5,5,5);

    public FormQuestionPanel(MainFrame frame) {
        this.frame = frame;

        layout = new GridBagLayout();
        constraints = new GridBagConstraints();
        setLayout(layout);

        createForm();
        createButtons();
    }

    private void createForm() {

        JLabel label;

        label = new JLabel("Id");
        addComponent(label, 0, 0);
        idTxt = new JTextField(30);

        idTxt.setEditable(false);
        addComponent(idTxt, 0, 1);

        createTypeQuestionComponent();

        label = new JLabel("Questão");
        addComponent(label, 2, 0);
        questionTxt = new JTextArea(5,30);
        JScrollPane scrollPane = new JScrollPane(questionTxt);
        addComponent(scrollPane, 2, 1, 1, 5);
    }

    public abstract void createTypeQuestionComponent();

    private void createButtons() {
        JPanel btnPanel = new JPanel();

        createSaveButton();
        System.out.println(saveBtn);
        btnPanel.add(saveBtn);

        createCancelButton();
        btnPanel.add(cancelBtn);

        addComponent(btnPanel, 11, 1);
    }

    public abstract void createSaveButton();
    
    private void createCancelButton() {
        cancelBtn = new JButton("Cancelar");
        cancelBtn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent arg0) {
                frame.showQuestionPanel();                
            }
        });
    }

    public void addComponent(JComponent comp, int row, int col) {
        addComponent(comp, row, col,1, 1);
    }

    public void addComponent(JComponent comp, int row, int col, int width, int height) {
        constraints.gridx = col;
        constraints.gridy = row;
        constraints.gridwidth = width;
        constraints.gridheight = height;
    
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.insets = FIELD_INSETS;
    
        layout.setConstraints(comp, constraints);
        add(comp);
      }

      public void setSaveBtn(JButton button){
        saveBtn = button;
      }

      public MainFrame getFrame(){
          return frame;
      }
      public JTextArea getQuestionTxt() {
          return questionTxt;
      }
}



    
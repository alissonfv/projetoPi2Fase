package FE;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuestionPanel extends JPanel {
    HomeFrame frame;

    private JButton btnCreate;
    private JButton btnChange;
    private JButton btnRemove;

    private JTable tableQuestions;
    
    public QuestionPanel(HomeFrame frame) {
        this.frame = frame;

        setLayout(new BorderLayout(10, 10));

        createBtns();
        createTable();
    }

    private void createTable() {
        tableQuestions = new JTable();
        tableQuestions.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

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
                // TODO chamar o método que mostra a tela de formulário de questão
            }
        });

        panelBtn.add(btnChange);
        
        btnChange = new JButton("Alterar");

        btnChange.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event) {
                // TODO chamar o método que mostra a tela de formulário de questão
            }
        });

        panelBtn.add(btnChange);
        
        btnRemove = new JButton("Remover");

        btnRemove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                // TODO aplicar os métodos de remoção
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

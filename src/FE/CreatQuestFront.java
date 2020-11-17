package Senai.prog_oo_java.pi_2fase;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class CreatQuestFront extends JFrame {
    private static final Insets FIELD_INSETS = new Insets(5, 10, 0, 0);
    private static final int NUM_RADIOBTN = 5;
    private JButton button;


    private GridBagLayout layout;
    private GridBagConstraints constraints;

    public CreatQuestFront() {
        super("Demo Input Fields");

        JPanel contentPane = new JPanel();
        contentPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        contentPane.setBackground(Color.CYAN);
        setContentPane(contentPane);
        setSize(1000, 650);

        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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
        JRadioButton radioButton;

        /**
         * Componentes de texto
         */
        label = new JLabel("NOVA QUESTÃO");

        label.setForeground(Color.BLACK);
        addComponent(label, 0, 2, 1, 1);
        separator = new JSeparator();
        addComponent(separator, 2, 1, 3, 1);


        label = new JLabel("Questão: ");
        label.setForeground(Color.BLACK);
        addComponent(label, 2, 2, 1, 1);
        JTextField textFieldResposta = new JTextField(2);
        addComponent(textFieldResposta, 3, 1, 3, 1);

        /** Alternativas */
        label = new JLabel("Alternativas: ");
        label.setForeground(Color.BLACK);
        addComponent(label, 4, 2, 1, 1);

        /** Alternativa 1*/
        label = new JLabel("1) ");
        label.setForeground(Color.BLACK);
        addComponent(label, 5, 1, 1, 1);
        JTextField textFieldA = new JTextField(2);
        addComponent(textFieldA, 5, 2, 3, 1);

        /** Alternativa 2 */
        label = new JLabel("2) ");
        label.setForeground(Color.BLACK);
        addComponent(label, 6, 1, 1, 1);
        JTextField textFieldB = new JTextField(2);
        addComponent(textFieldB, 6, 2, 3, 1);

        /** Alternativa 3 */
        label = new JLabel("3) ");
        label.setForeground(Color.BLACK);
        addComponent(label, 7, 1, 1, 1);
        JTextField textFieldC = new JTextField(2);
        addComponent(textFieldC, 7, 2, 3, 1);

        /** Alternativa 4 */
        label = new JLabel("4) ");
        label.setForeground(Color.BLACK);
        addComponent(label, 8, 1, 1, 1);
        JTextField textFieldD = new JTextField(2);
        addComponent(textFieldD, 8, 2, 3, 1);

        /** Alternativa 5 */
        label = new JLabel("5) ");
        label.setForeground(Color.BLACK);
        addComponent(label, 9, 1, 1, 1);
        JTextField textFieldE = new JTextField(2);
        addComponent(textFieldE, 9, 2, 3, 1);

        /**
         * Componentes de Botão
         */

        label = new JLabel();
        addComponent(label, 11, 0, 1, 1);
        button = new JButton("Criar");
        button.addActionListener(handler);
        addComponent(button, 11, 2, 1, 1);

        label = new JLabel("Questão Correta:");
        addComponent(label, 10, 0, 1, 1);
        panel = new JPanel();
        ButtonGroup buttonGroup = new ButtonGroup();
        for (int i = 1; i <= NUM_RADIOBTN; i++) {
            radioButton = new JRadioButton("" +i);
            buttonGroup.add(radioButton);
            panel.add(radioButton);
        }
        addComponent(panel, 10, 1, 3, 1);

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
            if (event.getSource() == button) {
                System.out.println("Questão criado com sucesso!");
            }
        }
    } // fim da classe ActionEventHandler
} // fim da classe ActionEventFrame

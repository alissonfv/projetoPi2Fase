package FE;

import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {

    private CardLayout layout;
    private JPanel cardsPanel;
    private HomePanel homePanel;
    private QuestionPanel questionPanel;
    private CreatQuestFront creatQuestPanel;

    public MainFrame() {
        this.layout = new CardLayout();
        this.cardsPanel = new JPanel();
        this.cardsPanel.setLayout(layout);
        add(cardsPanel);
        this.createCards();
        
        this.showHomePanel(this.homePanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void draw() {
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void createCards() {
        this.homePanel = new HomePanel(this);
        this.cardsPanel.add(this.homePanel, HomePanel.class.getName());

        this.questionPanel = new QuestionPanel(this);
        this.cardsPanel.add(this.questionPanel, QuestionPanel.class.getName());// criar cards e adicionar dentro dos
                                                                               // panel

        this.creatQuestPanel = new CreatQuestFront(this);
        this.cardsPanel.add(this.creatQuestPanel, CreatQuestFront.class.getName());
    }

    public void showHomePanel(JPanel jPanel) {
        this.layout.show(this.cardsPanel, jPanel.getClass().getName()); // mostrar cards que esta no layout
        // tem que ter um para cada card
    }

    public void showCreatQuest() {
        this.layout.show(this.cardsPanel, CreatQuestFront.class.getName());
    }
}

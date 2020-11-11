import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class FrontQuest extends JFrame {
	public FrontQuest() {
		super("The Game");
		
		Front();
	}
		
	private void Front() {
		JPanel buttonPanel, buttonClose;
		JButton buttons[], button, close ;
		JLabel label;
		Container c = getContentPane();
	
	
		//BOTÕES DE ALTERNATIVA
		buttonPanel = new JPanel();
		buttons = new JButton[5];
		buttonPanel.setPreferredSize(new Dimension(300, 250));
		buttonPanel.setBackground(Color.CYAN);
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("Alternativa " + (i + 1) + "  =   " +(i + 3) + " pedaços ");
			buttonPanel.add(buttons[i]);		
		buttonPanel.setLayout(new GridLayout(5, 5, 15, 5));
		c.add(buttonPanel, BorderLayout.SOUTH);
		}
		

		//PAINEL DE FUNDO 
		buttonPanel = new JPanel();
		buttonPanel.setBackground(Color.CYAN);
		buttonPanel.setPreferredSize(new Dimension(300, 400));
		add(buttonPanel);
		
		//BOTÃO DE VOLTAR
		buttonPanel = new JPanel();
		button = new JButton("Voltar Questão");
		buttonPanel.setBackground(Color.CYAN);
		buttonPanel.setPreferredSize(new Dimension(200, 100));
		buttonPanel.setLayout(new FlowLayout());
		buttonPanel.add(button);
		add(buttonPanel, BorderLayout.WEST);

		//BOTÃO DE PRÓXIMA QUESTÃO
		buttonPanel = new JPanel();
		button = new JButton("Próxima Questão");
		buttonPanel.setBackground(Color.CYAN);
		buttonPanel.setPreferredSize(new Dimension(200, 100));
		buttonPanel.setLayout(new FlowLayout());
		buttonPanel.add(button);
		add(buttonPanel, BorderLayout.EAST);
		
		
		//BOTÃO DE FECHAR 
		buttonClose = new JPanel();
		close = new JButton("Fechar");
		buttonPanel.setBackground(Color.CYAN);
		buttonPanel.setPreferredSize(new Dimension(200, 100));
		buttonClose.add(close);
		add(buttonClose, BorderLayout.NORTH);
		//EVENTO FECHAR
		close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	
		//CAIXA DE TEXTO
		label = new JLabel( "             Uma pizza tem 8 pedaços.  Manoel comeu 1/2 pedaços, quantos pedaços sobraram? ");
		label.setPreferredSize(new Dimension(120, 100));
		setSize(1000, 700);
		add(label,BorderLayout.CENTER);
					
		}
		
}//FIM CLASSE

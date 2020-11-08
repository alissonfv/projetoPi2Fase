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
	JPanel buttonPanel, botaofechar;
	JButton buttons[], botao,fecha;
	JLabel label;
	JScrollPane scrollPane;
	JTextField caixa;
	Container c = getContentPane();
	
	
		//BOTÕES DE ALTERNATIVA
		buttonPanel = new JPanel();
		buttons = new JButton[5];

		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton("Alternativa " + (i + 1));
			buttonPanel.add(buttons[i]);
			buttonPanel.setPreferredSize(new Dimension(300, 250));
		}		
		buttonPanel.setLayout(new GridLayout(5, 5, 15, 5));
		c.add(buttonPanel, BorderLayout.SOUTH);
		

		//PAINEL DE FUNDO 
		buttonPanel = new JPanel();
		buttonPanel.setBackground(Color.LIGHT_GRAY);
		buttonPanel.setPreferredSize(new Dimension(300, 400));
		add(buttonPanel);
		
		//BOTÃO DE VOLTAR
		buttonPanel = new JPanel();
		botao = new JButton("Voltar Questão");
		buttonPanel.setBackground(Color.DARK_GRAY);
		buttonPanel.setPreferredSize(new Dimension(200, 100));
		buttonPanel.setLayout(new FlowLayout());
		buttonPanel.add(botao);
		add(buttonPanel, BorderLayout.WEST);

		//BOTÃO DE PRÓXIMA QUESTÃO
		buttonPanel = new JPanel();
		botao = new JButton("Próxima Questão");
		buttonPanel.setBackground(Color.cyan);
		buttonPanel.setPreferredSize(new Dimension(200, 100));
		buttonPanel.setLayout(new FlowLayout());
		buttonPanel.add(botao);
		add(buttonPanel, BorderLayout.EAST);
		
		
		//BOTÃO DE FECHAR 
		botaofechar = new JPanel();
		fecha = new JButton("Fechar");
		buttonPanel.setBackground(Color.cyan);
		buttonPanel.setPreferredSize(new Dimension(200, 100));
		botaofechar.add(fecha);
		add(botaofechar, BorderLayout.NORTH);
		//EVENTO FECHAR
		fecha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		caixa = new JTextField("PERGUNTA XXX", 20);
		caixa.setPreferredSize(new Dimension(5, 3));
		setSize(1000, 700);
		add(caixa);
		
		}
		
}//FIM CLASSE

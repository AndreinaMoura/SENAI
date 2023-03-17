package visao;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controle.ProcessaPlanilha;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaLogin extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	// atributos da tela
	private JPanel painel;
	private JLabel rotulo1, rotulo2;
	private JTextField nome, ano;
	private JButton cadastro;

	public TelaLogin() {

		// Propriedades Básicas
		setTitle("Tela de Login");
		setBounds(600, 300, 400, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		painel = new JPanel();
		setContentPane(painel);
		setLayout(null);

		// Conteúdos da tela
		rotulo1 = new JLabel("Nome:");
		rotulo1.setBounds(20, 20, 100, 20);
		
		nome = new JTextField();
		nome.setBounds(150, 20, 200, 30);
		
		rotulo2 = new JLabel("Ano de Nascimeto:");
		rotulo2.setBounds(20, 60, 200, 20);
		
		ano = new JTextField();
		ano.setBounds(150, 60, 200, 30);
		
		cadastro = new JButton("Ok");
		cadastro.setBounds(150, 100, 200, 30);
		cadastro.addActionListener(this);

		painel.add(rotulo1);
		painel.add(nome);
		painel.add(rotulo2);
		painel.add(ano);
		painel.add(cadastro);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == cadastro) {
			
		}
	}
	public static void main(String[] args) {
		ProcessaPlanilha.carregar();
		TelaLogin tela = new TelaLogin();
		tela.setVisible(true);
	}
}

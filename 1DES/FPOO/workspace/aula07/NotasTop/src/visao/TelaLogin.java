package visao;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TelaLogin extends JFrame {

	private static final long serialVersionUID = 1L;

	// atributos da tela
	private JPanel painel;
	private JLabel rotulo1, rotulo2, rotulo3, rotulo4;
	private JTextField nome, n1, n2, n3;
	private JButton login;

	public TelaLogin() {

		// Propriedades Básicas
		setTitle("Tela de Login");
		setBounds(600, 300, 450, 350);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		painel = new JPanel();
		setContentPane(painel);
		setLayout(null);

		// Conteúdos da tela
		rotulo1 = new JLabel("Nome:");
		rotulo1.setBounds(50, 50, 100, 20);
		
		nome = new JTextField();
		nome.setBounds(150, 50, 200, 30);
		
		rotulo2 = new JLabel("Nota 1:");
		rotulo2.setBounds(50, 90, 100, 20);
		
		n1 = new JTextField();
		n1.setBounds(150, 90, 200, 30);
		
		rotulo3 = new JLabel("Nota 2:");
		rotulo3.setBounds(50, 130, 100, 20);
		
		n2 = new JTextField();
		n2.setBounds(150, 130, 200, 30);
		
		rotulo4 = new JLabel("Nota 3:");
		rotulo4.setBounds(50, 170, 100, 20);
		
		n3 = new JTextField();
		n3.setBounds(150, 170, 200, 30);
		
		login = new JButton("Cadastrar");
		login.setBounds(150, 210, 200, 30);

		painel.add(rotulo1);
		painel.add(nome);
		painel.add(rotulo2);
		painel.add(n1);
		painel.add(rotulo3);
		painel.add(n2);
		painel.add(rotulo4);
		painel.add(n3);
		painel.add(login);
	}

	public static void main(String[] args) {
		TelaLogin tela = new TelaLogin();
		tela.setVisible(true);
	}
}

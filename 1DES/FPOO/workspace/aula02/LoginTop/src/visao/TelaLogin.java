package visao;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controle.UsuarioProcessa;


public class TelaLogin extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	// atributos da tela
	private JPanel painel;
	private JLabel rotulo1, rotulo2;
	private JTextField email, senha;
	private JButton login;

	public TelaLogin() {

		// Propriedades Básicas
		setTitle("Tela de Login");
		setBounds(600, 300, 360, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		painel = new JPanel();
		setContentPane(painel);
		setLayout(null);

		// Conteúdos da tela
		rotulo1 = new JLabel("Email:");
		rotulo1.setBounds(20, 20, 100, 20);

		email = new JTextField();
		email.setBounds(120, 20, 200, 30);

		rotulo2 = new JLabel("Senha:");
		rotulo2.setBounds(20, 60, 100, 20);

		senha = new JTextField();
		senha.setBounds(120, 60, 200, 30);

		login = new JButton("Login");
		login.setBounds(120, 100, 200, 30);
		login.addActionListener(this);

		painel.add(rotulo1);
		painel.add(email);
		painel.add(rotulo2);
		painel.add(senha);
		painel.add(login);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == login) {
			int indice = UsuarioProcessa.checarEmail(email.getText());
			if (indice != -1) {
				if (UsuarioProcessa.checarSenha(indice, senha.getText())) {
					JOptionPane.showMessageDialog(this, "Acesso permitido");
					this.dispose();// Fecha o Formulário
				} else {
					JOptionPane.showMessageDialog(this, "Acesso negado");
				}
			} else {
				JOptionPane.showMessageDialog(this, "Usuário não encontrado");
			}
		}
	}
	public static void main(String[] args) {
		UsuarioProcessa.carregar();
		TelaLogin tela = new TelaLogin();
		tela.setVisible(true);
	}
}

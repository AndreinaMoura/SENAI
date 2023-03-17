package visao;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class TelaLogin extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	static ArrayList<String> longo = new ArrayList<>();
	static String entrada = "C:\\Users\\DESENVOLVIMENTO\\Desktop\\logic\\FPOO\\wk\\workspace\\NumerosAleatorios\\dados\\entrada.csv";

	// atributos da tela
	private JPanel painel;
	private JLabel rotulo1;
	JTextField rotulo2;
	private JButton ok;

	public TelaLogin() {

		// Propriedades Básicas
		setTitle("Tela de Login");
		setBounds(600, 300, 360, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		painel = new JPanel();
		setContentPane(painel);
		setLayout(null);

		// Conteúdos da tela
		rotulo1 = new JLabel("Números aleatórios:");
		rotulo1.setBounds(20, 20, 200, 20);
		
		rotulo2 = new JTextField(entrada);
		rotulo2.setBounds(20, 20, 200, 20);

		ok = new JButton("ok");
		ok.setBounds(120, 100, 200, 30);
		ok.addActionListener(this);

		painel.add(rotulo1);
		painel.add(rotulo2);
		painel.add(ok);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == ok) {
			
					this.dispose();// Fecha o Formulário
		}
	}
	public static void main(String[] args) {
		TelaLogin tela = new TelaLogin();
		tela.setVisible(true);
	}
}

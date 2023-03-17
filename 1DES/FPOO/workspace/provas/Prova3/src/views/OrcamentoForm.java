package views;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import controllers.OrcamentoProcess;
import models.Orcamento;

public class OrcamentoForm extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private DefaultTableModel tableModel;
	private JPanel panel;
	private JScrollPane scroll;
	private JButton adicionar, excluir, alterar, buscar;
	private JTextField id, fornecedor;
	public static JTextField produto;
	public static double p;
	public JTextField preco;
	private JLabel Lid, Lfornecedor, Lproduto, Lpreco;
	private JTable texto;
	private int codigo = OrcamentoProcess.orcamentos.size() + 1;

	private final Locale BRASIL = new Locale("pt", "BR");
	private DecimalFormat df = new DecimalFormat("#.00");
	
	OrcamentoForm() {
		setTitle("Registro de orçamentos");
		setBounds(250, 160, 550, 370);
		panel = new JPanel();
		panel.setBackground(new Color(255, 233, 213));
		setContentPane(panel);
		setLayout(null);

		Lid = new JLabel("Id:");
		Lid.setBounds(20, 20, 120, 30);
		panel.add(Lid);
		id = new JTextField(String.format("%d", codigo));
		id.setBounds(140, 20, 40, 30);
		id.setEditable(false);
		panel.add(id);

		Lfornecedor = new JLabel("Fornecedor:");
		Lfornecedor.setBounds(20, 60, 200, 30);
		panel.add(Lfornecedor);
		fornecedor = new JTextField();
		fornecedor.setBounds(140, 60, 200, 30);
		panel.add(fornecedor);

		Lproduto = new JLabel("Produto:");
		Lproduto.setBounds(20, 100, 200, 30);
		panel.add(Lproduto);
		produto = new JTextField();
		produto.setBounds(140, 100, 200, 30);
		panel.add(produto);
		
		Lpreco = new JLabel("Preço:");
		Lpreco.setBounds(20, 140, 200, 30);
		panel.add(Lpreco);
		preco = new JTextField();
		preco.setBounds(140, 140, 200, 30);
		panel.add(preco);

		adicionar = new JButton("Adicionar");
		adicionar.setBounds(400, 20, 100, 30);
		panel.add(adicionar);
		adicionar.addActionListener(this);

		excluir = new JButton("Excluir");
		excluir.setBounds(400, 140, 100, 30);
		panel.add(excluir);
		excluir.addActionListener(this);
		excluir.setEnabled(false);

		alterar = new JButton("Alterar");
		alterar.setBounds(400, 100, 100, 30);
		panel.add(alterar);
		alterar.addActionListener(this);
		alterar.setEnabled(false);

		buscar = new JButton("Buscar");
		buscar.setBounds(400, 60, 100, 30);
		panel.add(buscar);
		buscar.addActionListener(this);
		
		texto = new JTable();
		tableModel = new DefaultTableModel();
		tableModel.addColumn("Id");
		tableModel.addColumn("Fornecedor");
		tableModel.addColumn("Produto");
		tableModel.addColumn("Preço");
		tableModel.addColumn("Mais Barato");
		if(OrcamentoProcess.orcamentos.size() != 0) {
			preencherAreaDeTexto();
		}
		texto = new JTable(tableModel);
		scroll = new JScrollPane(texto);
		scroll.setBounds(20, 200, 500, 120);
		panel.add(scroll);

	}

	private void preencherAreaDeTexto() {
		int totLinhas = tableModel.getRowCount();
		if(tableModel.getRowCount() > 0) {
			for (int i = 0; i < totLinhas; i++) {
				tableModel.removeRow(0);
			}
		}
		for (Orcamento m : OrcamentoProcess.orcamentos) {
			tableModel.addRow(new String[] {m.getId("s"), m.getFornecedor(), m.getProduto(), m.getPreco("s"), m.comprar()});
		}
	}

	private void limparCampos() {
		id.setText(null);
		fornecedor.setText(null);
		produto.setText(null);
		preco.setText(null);
	}

	public void add() {
		if (id.getText().length() != 0 && produto.getText().length() != 0
				&& fornecedor.getText().length() != 0 && preco.getText().length() != 0) {

			df.setCurrency(Currency.getInstance(BRASIL));
			try {
				p = Double.parseDouble(df.parse(preco.getText()).toString());
			} catch (ParseException e) {
				System.out.println(e);
				p = 0;
			}
			
			OrcamentoProcess.orcamentos.add(new Orcamento(codigo, produto.getText(), fornecedor.getText(), p, OrcamentoProcess.comprarProdutos()));
			codigo++;
			OrcamentoProcess.salvar();
			preencherAreaDeTexto();
			limparCampos();
		} else {
			JOptionPane.showMessageDialog(this, "Favor preencher todos os campos.");
		}
	}

	public void del() {
		int Id = Integer.parseInt(id.getText());
		Orcamento prod = new Orcamento(Id);
		int indice = OrcamentoProcess.orcamentos.indexOf(prod);
		OrcamentoProcess.orcamentos.remove(indice);
		preencherAreaDeTexto();
		limparCampos();
		adicionar.setEnabled(true);
		alterar.setEnabled(false);
		excluir.setEnabled(false);
		id.setText(String.format("%d", codigo));
		OrcamentoProcess.salvar();
	}

	public void alterar() {
		int Id = Integer.parseInt(id.getText());
		Orcamento prod = new Orcamento(Id);
		int indice = OrcamentoProcess.orcamentos.indexOf(prod);
		if (id.getText().length() != 0 && produto.getText().length() != 0
				&& fornecedor.getText().length() != 0 && preco.getText().length() != 0) {

			df.setCurrency(Currency.getInstance(BRASIL));
			try {
				p = Double.parseDouble(df.parse(preco.getText()).toString());
			} catch (ParseException e) {
				System.out.println(e);
				p = 0;
			}
			OrcamentoProcess.comprarProdutos();
			OrcamentoProcess.orcamentos.set(indice,
					new Orcamento(Integer.parseInt(id.getText()),fornecedor.getText(), produto.getText(), p, OrcamentoProcess.comprarProdutos()));
			preencherAreaDeTexto();
			limparCampos();
		} else {
			JOptionPane.showMessageDialog(this, "Favor preencher todos os campos.");
		}
		adicionar.setEnabled(true);
		alterar.setEnabled(false);
		excluir.setEnabled(false);
		id.setText(String.format("%d", codigo));
		OrcamentoProcess.salvar();
	}

	public void busca() {
		String entrada = JOptionPane.showInputDialog(this, "Digite o código do produto:");

		boolean isNumeric = true;
		if (entrada != null) {
			for (int i = 0; i < entrada.length(); i++) {
				if (!Character.isDigit(entrada.charAt(i))) {
					isNumeric = false;
				}
			}
		} else {
			isNumeric = false;
		}
		if (isNumeric) {
			int Id = Integer.parseInt(entrada);
			Orcamento orca = new Orcamento(Id);
			if (OrcamentoProcess.orcamentos.contains(orca)) {
				int indice = OrcamentoProcess.orcamentos.indexOf(orca);
				id.setText(OrcamentoProcess.orcamentos.get(indice).getId("s"));
				fornecedor.setText(OrcamentoProcess.orcamentos.get(indice).getFornecedor());
				produto.setText(OrcamentoProcess.orcamentos.get(indice).getProduto());
				preco.setText(OrcamentoProcess.orcamentos.get(indice).getPreco("s"));
				adicionar.setEnabled(false);
				alterar.setEnabled(true);
				excluir.setEnabled(true);
				OrcamentoProcess.salvar();
			} else {
				JOptionPane.showMessageDialog(this, "Produto não encontrado");
			}
		}
	}
public void corzinha(){
	
}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == adicionar) {
			add();
		}
		if (e.getSource() == excluir) {
			del();
		}
		if (e.getSource() == alterar) {
			alterar();
		}
		if (e.getSource() == buscar) {
			busca();
		}
	}

	public static void main(String[] agrs) {
		OrcamentoProcess.abrir();
		new OrcamentoForm().setVisible(true);
	}
}

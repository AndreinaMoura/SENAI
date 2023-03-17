package agenda;


public class Contato {
	//atributos
	public int id;
	public String nome; 
	public int idade;
	public String telefone;
	
	//metodo construtor vazio
	public Contato(){}
	
	//metodo construtor completo
	Contato(int id, String nome, int idade, String telefone){
		this.id=id;
		this.nome=nome;
		this.idade=idade;
		this.telefone=telefone;
	}
	
	//metodo simples
	public String contatoTab() {
		return id+"\t"+nome+"\t"+telefone;
	}
}

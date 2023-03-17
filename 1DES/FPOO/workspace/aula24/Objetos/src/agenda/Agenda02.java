package agenda;

public class Agenda02 {

	public static void main(String[] args) {
		//criando um objeto
		Contato c1 = new Contato();
		//preenche os atributos
		c1.id=30;
		c1.nome="Pão";
		c1.idade=31;
		//mostra na tela
		System.out.println(c1.id+"\t"+c1.nome+"\t"+c1.idade);
		//limpa o objeto ou renova ele
		c1 = new Contato();
		//mostra na tela
		System.out.println(c1.id+"\t"+c1.nome+"\t"+c1.idade);
		c1.id=25;
		c1.nome="Zé";
		c1.idade=21;
		System.out.println(c1.id+"\t"+c1.nome+"\t"+c1.idade);
	}

}

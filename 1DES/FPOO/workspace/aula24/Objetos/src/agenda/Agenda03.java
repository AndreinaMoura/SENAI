package agenda;

public class Agenda03 {

	public static void main(String[] args) {

		Contato c1 = new Contato();
		c1.id=30;
		c1.nome="Pão";
		c1.idade=31;
		c1.telefone="(11) 12313123";
		
		Contato c2 = new Contato();
		c2.id=25;
		c2.nome="Zé";
		c2.idade=21;
		c2.telefone="(11) 11232313";
		
		System.out.println(c1.id+"\t"+c1.nome+"\t"+c1.idade+"\t"+c1.telefone);
		System.out.println(c2.id+"\t"+c2.nome+"\t"+c2.idade+"\t"+c2.telefone);
	}

}

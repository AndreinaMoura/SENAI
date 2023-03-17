package agenda;

public class Agenda04 {

	public static void main(String[] args) {

		Contato c1 = new Contato();
		Contato c2 = new Contato();
		
		c1.id=30;
		c1.nome="Pão";
		c1.idade=31;
		c1.telefone="(11) 12313123";
		
		c2.id=25;
		c2.nome="Zé";
		c2.idade=21;
		c2.telefone="(11) 11232313";
		
		System.out.println(c1.contatoTab());
		System.out.println(c2.contatoTab());
	}

}

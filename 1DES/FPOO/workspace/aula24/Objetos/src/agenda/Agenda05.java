package agenda;

public class Agenda05 {

	public static void main(String[] args) {

		Contato c1 = new Contato(30,"Pão",31,"(11) 123456789");
		Contato c2 = new Contato(25,"Zé",21,"(11) 987654321");
		
		System.out.println(c1.contatoTab());
		System.out.println(c2.contatoTab());
	}

}

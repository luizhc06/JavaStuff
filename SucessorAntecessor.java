import java.util.Scanner; 
public class SucessorAntecessor {

	public static void main(String[] args) { 
	Scanner in = new Scanner(System.in);
	
	int antecessor, sucessor, um_numero;
	
	System.out.print("Digite o valor do numero: ");
	
	um_numero = in.nextInt();
	in.nextLine();
	antecessor = um_numero-1;
	sucessor = um_numero+1;
	
	System.out.println("O valor do antecessor: " + antecessor);
	
	System.out.println("O valor do sucessor: " + sucessor);
	
	}
}

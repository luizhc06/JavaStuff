import java.util.Scanner;

public class PorcentagemIPI { 
	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in);
		 
		// ler a porcentagem do IPI a ser acrescido
		System.out.print("Digite a porcentagem do IPI a ser acrescentado: " );
		
		double porcentagemIPI = scanner.nextDouble();
		
		// ler os detalhes da peça 1 
		
		System.out.print("Digite o codigo da peça 1: ");
		int codigoPeca1 = scanner.nextInt();
		
		System.out.print("Digite o valor unitario da peça 1: ");
		double valorUnitarioPeca1 = scanner.nextDouble();
		
		System.out.print("Digite o valor da quantidade de peças 1: " );
        int quantidadePeca1 = scanner.nextInt();
        
        // Ler os detalhes da peça 2 
        
        System.out.print("Digite o codigo da peça 2: ");
		int codigoPeca2 = scanner.nextInt();
		
		System.out.print("Digite o valor unitario da peça 2: ");
		double valorUnitarioPeca2 = scanner.nextDouble();
		
		System.out.print("Digite o valor da quantidade de peças 2: " );
        int quantidadePeca2 = scanner.nextInt();
        
        // Calcular o valor total:
        
        double totalPeca1 = valorUnitarioPeca1 * quantidadePeca1;
        
        double totalPeca2 = valorUnitarioPeca2 * quantidadePeca2;
        
        double valorTotal = (totalPeca1 + totalPeca2) * (1 + porcentagemIPI / 100);
        
        // Resultado 
        
        System.out.println("Valor total a ser pago: " + valorTotal);
        
        scanner.close();

	}

}

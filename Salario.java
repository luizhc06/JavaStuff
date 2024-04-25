import java.util.Scanner;

public class Salario {
public static void main(String[] args) {
	
	double salarioMinimo;
	double seuSalario;
	double qtdSalariosMinimos;
	
	Scanner ler = new Scanner(System.in);
	
	System.out.println("Digite o valor do salario minimo: ");
	salarioMinimo = ler.nextDouble();
	
	System.out.println("Digite o seu salario: ");
	seuSalario = ler.nextDouble();
	
	qtdSalariosMinimos = seuSalario / salarioMinimo;
	
	if(seuSalario > salarioMinimo) {
		System.out.println((int) qtdSalariosMinimos + "SM=R$" + (seuSalario - salarioMinimo));
		} else {
			
			System.out.println("Faltam R$" + ((seuSalario - salarioMinimo) * -1) + "para voce alcançar o salario minimo");
		}
     } 
}

 //SM = SALARIO MINIMO 

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        System.out.println("Vamos calcular!");

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Por favor, escolha uma das opcoes:");
            System.out.println("-----------------------------");
            System.out.println("| 1 - Soma                  |");
            System.out.println("| 2 - Subtracao             |"); 
            System.out.println("| 3 - Multiplicaçao         |"); 
            System.out.println("| 4 - Divisao               |"); 
            System.out.println("| 0 - Sair                  |"); 
            System.out.println("-----------------------------"); 

            int choice = input.nextInt();

            if (choice == 0) {
                System.out.println("Obrigado por usar a calculadora. Ate logo! c: ");
                break;
            }

            System.out.print("Escreva o primeiro número: ");
            int number1 = input.nextInt();

            System.out.print("Escreva o segundo número: ");
            int number2 = input.nextInt();

            switch (choice) {
                case 1:
                    int sum = number1 + number2;
                    System.out.printf("Resultado da Soma: %d%n", sum);
                    break;
                case 2:
                    int difference = number1 - number2;
                    System.out.printf("Resultado da Subtração: %d%n", difference);
                    break;
                case 3:
                    int product = number1 * number2;
                    System.out.printf("Resultado da Multiplicação: %d%n", product);
                    break;
                case 4:
                	double division = (double) number1 / number2;
                    System.out.printf("Resultado da Divisão: %.2f%n", division);
                    break;
                default:
                    System.out.println("Opção inválida. Escolha novamente.");
                    break;
            }
        }
    }
}

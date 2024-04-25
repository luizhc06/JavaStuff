// Método maximum declarado pelo programador com três parâmetros double.
import java.util.Scanner;

 public class EncontrarMaximo 
 {
 // obtém três valores de ponto flutuante e localiza o valor máximo
 public static void main(String[] args)
 {
 // cria Scanner para entrada a partir da janela de comando
 Scanner input = new Scanner(System.in);

 // solicita e insere três valores de ponto flutuante
 System.out.print(
 "Insira tres valores de ponto flutuante separados por espacos: ");
 double number1 = input.nextDouble(); // lê o primeiro double
 double number2 = input.nextDouble(); // lê o segundo double
 double number3 = input.nextDouble(); // lê o terceiro double

 // determina o valor máximo
double result = maximo(number1, number2, number3);

 // exibe o valor máximo 
 System.out.println("O valor máximo eh: " + result);
 } 

// retorna o máximo dos seus três parâmetros de double 
public static double maximo(double x, double y, double z) 
{ 
 double maximumValue = x; // supõe que x é o maior valor inicial

 // determina se y é maior que maximumValue 
if (y > maximumValue) 
 maximumValue = y; 

 // determina se z é maior que maximumValue 
if (z > maximumValue) 
maximumValue = z; 

 return maximumValue; 
}  
} // fim da classe MaximumFinder

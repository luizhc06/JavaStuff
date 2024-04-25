package comparar;
import java.util.*;

public class main {	
	public static void main(String[] args) {
	 
	Scanner input = new Scanner(System.in);
	
	int number1; 
	int number2;
	
 System.out.print("Entre com o primeiro numero inteiro:");
	number1 = input.nextInt();
	
 System.out.print("Entre com o segundo numero inteiro:");
	number2 = input.nextInt();
	
 if(number1 == number2) {
	System.out.printf("%d = %d%n", number1, number2); // x igual y
  System.out.printf("você digitou um numero igual");
}

 if(number1 != number2) {
	System.out.printf("%d != %d%n", number1, number2); // x não é igual y
 System.out.printf("nao e igual");
 }
 
 if(number1 < number2) { 
		System.out.printf("%d < %d%n", number1, number2); // x menor que y
 System.out.printf("você digitou um numero que e menor que %d%n", number2);
 }
 
 if(number1 > number2) { 
		System.out.printf("%d > %d%n", number1, number2); // x menor que y
System.out.printf("você digitou um numero que e maior que %d", number1);
 }
 
   }
}
  

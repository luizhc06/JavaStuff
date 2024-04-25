import java.util.ArrayList;

public class Array5 {
	
	public static void main(String[] args) { 
		ArrayList<String> items = new ArrayList<String>();
		
		items.add("red");
		items.add(0, "yellow");
		
		System.out.print("Exibir o conteudo da lista com loop controlado por contador: ");
		
		for (int i = 0; i < items.size(); i++) {
			System.out.printf(" %s", items.get(i));
		}
		
		display(items, "Remova os dois elementos novos: ");
		
		items.add("red");
		items.add("yellow");
		display(items, "Renova o segundo elemento da lista (verde): ");
		
		items.remove("yellow");
		display(items, "Remova o primeiro elemento de amarelo");
		
		items.remove(1);
		display(items, "Remova o segundo elemento de (verde): ");
		
		System.out.printf("\"red\" está na lista%n" , items.contains("red") ? "sim" : "nao");
			
	    System.out.printf("Tamanho: %s%n", items.size());
	}
	
	public static void display(ArrayList<String> items, String header) { 
		System.out.printf(header);
		
		for(String item : items) {
			System.out.printf(" %s", item);
		}
		
		System.out.println();   
	}		
}

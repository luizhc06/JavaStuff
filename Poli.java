public class Poli {
	public static void main(String[] args) {
		Retangulo [] vetor = new Retangulo[4];
		
		vetor [0] = new Retangulo(new Ponto(), new Ponto(34, 56));
		
		vetor [1] = new Retangulo(new Ponto(400, 500), new Ponto(500, 700));
		
		vetor [2] = new RetanguloPreenchido(new Ponto(23, 56), new Ponto(40, 70), "Vermelho");
		
		vetor [3] = new RetanguloPreenchido(new Ponto(), new Ponto(1000, 2000), "Preto");
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
			
		}
		
		System.out.println("---------------");
		for (int i = 0; i < vetor.length; i++) {
			vetor[i].getPontoB().setX(0);
			
		}
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
			
		}
		
		System.out.println("-------------");
		for (int i = 0; i < vetor.length; i++) {
		  if (vetor [i] instanceof RetanguloPreenchido) { 
			RetanguloPreenchido p = (RetanguloPreenchido) vetor [i];
			p.setCor("Branco");
			
		}
		
	    for (int i1 = 0; i1 < vetor.length; i1++) {
	 	 System.out.println(vetor[i1]);
		
        	}
    	}	
    }
}

package estagio;

public class One {
	public static void main(String[] args) {

	 	exercice_one(); 	
		exercice_two(10);
		
		/* 
		 * exercice_three
		 * 
		 * a) 1, 3, 5, 7, [9]
		 * b) 2, 4, 8, 16, 32, 64, [128]
		 * c) 0, 1, 4, 9, 16, 25, 36, [47]
		 * d) 4, 16, 36, 64, [100]
		 * e) 1, 1, 2, 3, 5, 8, [13]
		 * f) 2, 10, 12, 16, 17, 18, 19, []   
			
		*/
		
		
		/*
		 * exercice_four
		 * 
		 * - Ligaria todos os interruptores
		 * - Escolheria uma primeira aletóriamente para desligar
		 * - Repetiria o processo com a segunda lampada
		 * - Como consegui descobrir quais são as duas primeiras restara a ultima lampada e o ultimo interruptor
		 * 
		 * */
		
		exercice_fiveA("Leandro");
		exercice_fiveB("Leandro");
		
		
	}

	

	private static void exercice_one() {
		int INDICE = 13, SOMA = 0, K = 0; 

	 	while(K < INDICE) { 
			K = K + 1; 
			SOMA = SOMA + K; 
		}
	 	System.out.println("Soma: "+SOMA);
	}
	
	private static void exercice_two(int numero) {
		boolean achou = false;
		for (int i = 0; i < numero; i++) {
			if(Fibonacci(i) == numero) 
				achou = true;
		}
		
		if(achou) {
			System.out.println("O número " +numero+ " pertence a Sequência");
		} else
			System.out.println("Número " +numero+ " não ertence a Sequência");
	}
	
	private static int Fibonacci(int n) {	
			return (n<2) ? n : (Fibonacci(n-1) + Fibonacci(n-2));
	}
	
	private static void exercice_fiveA(String word) {
		System.out.println(new StringBuilder(word).reverse().toString());
	}
	
	private static void exercice_fiveB(String word) {
		char[] c = word.toCharArray();
		int last = c.length-1;
		char temp;
		for(int i=0; i<= last; i++) {
			temp= c[i];
			c[i] = c[last];
			c[last] = temp;
			last--;
		}
		System.out.print(c);
		
	}
}

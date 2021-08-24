package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		// F to C Conversion -> (F - 32) x 5/9 = C
		
		final double F = 86;
		int ajuste= 32;
		double div= (double)5/9; //Divisao de duas variaveis inteiras, preciso passar para Double alguma delas (ou 5.0/9.0)
		
		double C = (F-ajuste)*div;
		System.out.println(C);
		
		/*
		 * Maneira mais otimizada:
		 
			C = (F - 32)*5/9;
			System.out.println(C);
		 */
		
	}
}

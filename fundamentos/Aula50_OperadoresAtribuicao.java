package fundamentos;

public class Aula50_OperadoresAtribuicao {

	public static void main(String[] args) {
		
		int a = 3;
		int b = a;
		int c = a + b;
		
		c += b; // c = c + b;
		c -= a; // c = c - a;
		c *= b; // c = c * b;
		
		System.out.println(c);
		
		c++; // c = c + 1;
		
		System.out.println(c);
		
	}
}

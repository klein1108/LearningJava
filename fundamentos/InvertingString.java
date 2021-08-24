package fundamentos;

import java.util.Scanner;

public class InvertingString {

	public static void main(String[] args){

		int i=0;
		char a;
		
		Scanner pega = new Scanner(System.in);
		
		System.out.print("Digite uma palavra: ");
		String s= pega.nextLine();
		pega.close();
		System.out.println("\nVoce Digitou: "+s);
		String b="";
		
		i=(s.length()-1);
	
		while(i>=0){
			a=s.charAt(i);
			// System.out.print(a);
			b=b+a;
			i--;
		}
		System.out.println(b);
	
		if(s.equals(b)){
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	
		// System.out.println(s.concat("!!!"));
		// System.out.println(s + "!!!");
	}
}

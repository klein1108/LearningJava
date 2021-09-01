package fundamentos;

import java.util.Scanner;

public class JavaOutputFormatting {

	public static void main(String[] args) {
		
		Scanner user = new Scanner(System.in);
		System.out.println("================================");
		for(int i=0;i<3;i++) {
			
			String name = user.next();
			int numb = user.nextInt();
			System.out.printf("%-15s%03d\n",name,numb);
		}
		System.out.println("================================");
		
	}

}

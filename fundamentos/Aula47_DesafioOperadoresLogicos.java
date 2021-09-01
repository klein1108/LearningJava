package fundamentos;

import java.util.Scanner;

public class Aula47_DesafioOperadoresLogicos {

	public static void main(String[] args) {
		System.out.println("Answer with True(for yes) and False(for no)");
		
		while(true) {
			
			Scanner user = new Scanner(System.in);
			
			System.out.print("\nThe Tuesday job was confirmed? ");
			String day = user.next();
			boolean tuesday=Boolean.parseBoolean(day);
			
			System.out.print("\nThe Thursday job was confirmed? ");
			day = user.next();
			boolean thursday=Boolean.parseBoolean(day);
			
			if((tuesday==true)&&(thursday==true)){
				System.out.println("You buy a 50 inches Television and you took your"
						+ " family to the shopping to eat ice cream");
				
			}else if((tuesday==true)||(thursday==true)){
				System.out.println("You buy a 30 inches Television and you took your"
						+ " family to the shopping to eat ice cream");
			}else {
				System.out.println("You and your family stayed at home...");
			}
			
		}
	}
}
/* 
 Challenge: 
 
  - An unconfirmed job on Tuesday (T or F)
  - An unconfirmed job on Thursday (V ou F)

	if both Tuesday and Thursday jobs be confirmed then:
		- Buy a 50 inches TV + ice cream at the shopping
		
	if only one job be confirmed then:
		- Buy a 35 inches TV + ice cream at the shopping
		
	if neither jobs be confirmed then:
		-nothing happens

*/
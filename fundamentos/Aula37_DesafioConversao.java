package fundamentos;

import java.util.Scanner;

/*Conversio Challange:
 * With the Scanner method, take three Strings from the user to receive the last
 * three salaries from one emplyee, print them and the avarage. However the user
 * can use not only dot but also comma to separate itenger value from decimals.
 */
public class Aula37_DesafioConversao {

	public static void main(String[] args) {
		
		String oneS, twoS, threeS; 						//Declaring three strings
		
		Scanner user = new Scanner(System.in);			//Declaring the Scanner feature

		System.out.println("Digite o valor do seu primeiro salario: ");
		oneS=user.nextLine().replace(",", ".");			

		System.out.println("Digite o valor do seu segundo salario: ");
		twoS=user.nextLine().replace(",", ".");

		
		System.out.println("Digite o valor do seu terceiro salario: ");
		threeS=user.nextLine().replace(",", ".");

		/*Taking the values from the user by the Scanner method and storing in one of the String variables at
		 the time, also the value of each string is being changed if has a comma on it... if it does, the comma
		 is substituted by a dot, if it doesn't nothing happens*/	
				
		double oneD = Double.parseDouble(oneS);
		double twoD = Double.parseDouble(twoS);
		double threeD = Double.parseDouble(threeS);
		
		/*Taking string values after the change and storing it in a double variable, because of its Wrapper method
		  parse.Double() which turn a String value on a Double value in this case */

		System.out.println("\nSalario 1: R$"+oneD);
		System.out.println("Salario 2: R$"+twoD);
		System.out.println("Salario 3: R$"+threeD);
		
		//Printing the three values
		
		System.out.println("\nMédia dos salarios: R$"+(oneD + twoD + threeD)/3);
		
		//Printing the avarage of them.

		user.close();	//finishing the Scanner variable to save resources

	}
}

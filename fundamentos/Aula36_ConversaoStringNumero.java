package fundamentos;

import javax.swing.JOptionPane;
//import java.math.BigDecimal;

public class Aula36_ConversaoStringNumero {

	public static void main(String[] args) {
		
		String valor1 = JOptionPane.showInputDialog(
				"Digite o primeiro número");
		
				String valor2 = JOptionPane.showInputDialog(
				"Digite o segundo número:");
				
				/* JOptionPane -> Show a windows screen to the user a diolog box
				  (import javax.swing.JOptionPane-> metodo da biblioteca Swing)
				  showInputDialog -> Show a input bar which you can can use to
				  type the number that you want*/

				System.out.println(valor1 + valor2);
				
				/* This is literaly a sum of two values, but when you're adding
				  two string values we just get the concatenation of them
				 
				  Expected Result = 12.75(valor1) + 10.75(valor2) = 23.5  
				  Received Result = 12.75(valor1) + 10.75(valor2) = 12.7510.75
				 
				  So for we have the Expected result we need to transform the
				  Strings to Integers/Decimal values with the Wrapper method
				  "parse.'Type'" :
				  */

				double value1 = Double.parseDouble(valor1);
				double value2 = Double.parseDouble(valor2);

				// double[type] value1[name] = Double[Wrapper].parseDouble[Wrapper method](valor1[String that I want to transform])

				System.out.println("The sum of the two typed values is: "+(value1 + value2));
				System.out.println("The avarage of the sum is: "+(value1 + value2)/2);

				/*The math system of most programming languages is based on an algorithm which tries to be faster
				 than precise... that is why if we put 7.9 + 8.3 the result's going to be:
				 16.200000000000003 because the result is not 100% precise on the viewpoint of the program
				 
				 to extract the most precise result from the equation, we can import another library:
				  import java.math.BigDecimal
				 
				  and use the BigDecimal method to have this most precise result.
				 */

				System.out.println(7.9 + 8.3);
				
				/* after the java.math.BigDecimal import, we use this syntaxes to manipulate the numbers
				BigDecimal a = new BigDecimal(7.9);
				BigDecimal b = new BigDecimal(8.3);
				BigDecimal big = a.add(b);  here,just because of the statically-typed (tipagem) syntax
				 of java language, we need to create another BigDecimal variable
				 to add(with a sub method inside the BigDecimal method)
				System.out.println(big);)

				The result would be -> 16.2000000000000010658141036401502788066864013671875
				*/
	}
}

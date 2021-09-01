package fundamentos;

/*
 * Usint the Math.pow(,); method to apply the power to a number, solve the following equation:
 *  -                                       -
 * |                    -			   -     |^3
 * | [6 *(3 + 2)]^2     | (1-5) * (2-7) |^2  |
 * | ------------     - | ------------- |    |
 * | 	3*2             |       2       |    |
 * |                    -             -      |
 *  -                                       -
 *  ______________________________________
 *  
 *  				10^3
 */

public class Aula43_DesafioAritmetico {
	
	public static void main(String[] args) {
		
		int x,y;

		//---|Second operation|----------------------------------		
		x=(((1-5)*(2-7))/2);
		x=(int)Math.pow(x, 2);
		
		//---|First operation|-----------------------------------	
		y = (6*(3+2));
		y=(int)Math.pow(y, 2);
		y=y/(3*2);
		
		//---|Printing the calcultation|-------------------------
		System.out.printf("(%d - %d)^3\n-------------\n   10^3\n\n",y,x);
		
		y = y-x;
		y=(int)Math.pow(y, 3);
		y=y/(int)Math.pow(10, 3);
		
		System.out.println("The result of the mathematical calculation is: "+y); //125 = Correct Answer

	}
}

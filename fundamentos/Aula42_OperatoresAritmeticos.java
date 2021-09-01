package fundamentos;

public class Aula42_OperatoresAritmeticos {

	public static void main(String[] args) {
		
		var x=34.56;
		double y = 2.2;
		int a=8;
		int b=3;
		
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println((double)a/b);
		/* Here I did the casting because the result of the division beetwen two variable with the 
		 * same type will ALWAYS has the same type of them... so I need to transform to 
		 * double(with casting) by saying the cast type before any of those variables, and the answer
		 *  is going to be printed as a variable with the established casting type
		 * */
		System.out.println(4%2);
		/* This arithmetic operator returns the rest of the division between the two divided values.
		 * For example:
		 * 	4 |2
		 * -4	2
		 * ---
		 *  0    -> this is the % operator result printed (= the rest of the division operation)
		 * */
		
		
	}
}

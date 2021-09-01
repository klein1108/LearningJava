package fundamentos;

public class Aula46_OperadoresLogicos {

	public static void main(String[] args) {
		
		boolean v = true;
		boolean f = 3>7;		
		
		/* This boolean variable will see if the information is true or false
		 * and it will add the result to its variable. For example:
		 * 
		 * bolean f = 3>7;
		 * 
		 * Is it three greater than seven?
		 * No, it isn't -> so the variable "F" take the "False" as an eigenvalue (auto valor)
		 */
		
		System.out.println(v && f);
		System.out.println(v || f);
		System.out.println(v ^ f);
		System.out.println(!v);
		System.out.println(!!f);
		
		System.out.println("\nTruth table of the AND expression:");
		System.out.println(false && false); //Dead code = the code doesn't get here because it got the anwser before here	
		System.out.println(false && true); //Dead code
		System.out.println(true && false);
		System.out.println(true && true);
		
		System.out.println("\nTruth table of the OR expression:");
		System.out.println(false || false);
		System.out.println(false || true);
		System.out.println(true || false); //Dead code
		System.out.println(true || true); //Dead code
		
		System.out.println("\nTruth table of the XOR expression:");
		System.out.println(false ^ false);
		System.out.println(false ^ true);
		System.out.println(true ^ false); 
		System.out.println(true ^ true); 
		
		System.out.println("\nTruth table of the ! expression:");
		System.out.println(!true);
		System.out.println(!false); 
		
	}
}

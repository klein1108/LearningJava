package fundamentos;

public class Aula35_ConversaoNumeroString {

	public static void main(String[] args) {
		Integer num1 = 10000;
		System.out.println(num1.toString().length());

		/* Here we have an Integer number that became a string
		  because of the Wrapper declaration and interaction of
		  num1 variable with the toString method
		 
		  Changing an integer variable to a String is good for
		  some reasons, one of them and the principal one is that
		  we can interact this value with any String method (that
		  it has(?))
		 
		  Like in this case that we used an Integer number
		  converted by String and we could used the length
		  method to see how many (casas inteiras???) this
		  number has*/

		int num2 = 1000000;
		System.out.println(Integer.toString(num2).length());

		/* We can also use the Wrapper declaration inside the
		* Stdout and there we can associate the integer value
		* with the toString method, and then associate with any
		* String method that we want.*/

	}
}

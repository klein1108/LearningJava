package fundamentos;

import java.util.Scanner;

public class Aula32_Wrappers {
	
	public static void main(String[] args) {
		

		Byte b = 100;								//Byte
		Short sh = 1000;							//Short
		Integer i = 10000;							//Int 
		Long l = 1000000L;							//Long
		Boolean bo = Boolean.parseBoolean("True");	//Bolean with the parse.Boolean method
		Character c = '#';							//Char
		
		Float f = 123.15F;							//Float
		Double d = 10.999;							//Double

		System.out.println(b.byteValue());
		System.out.println(sh.toString());			//Short value converted to a String value
		System.out.println(i.intValue());
		System.out.println(l.longValue());
		
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		System.out.println(c.toString());

		i=1;
		System.out.println(i/2.0);	
		
		System.out.println(f.floatValue());
		System.out.println(d.doubleValue());
		System.out.println(d.intValue());			//This makes it ignore the decimal part
		
//------------------------------------------------------------------------------------------------------------------------		
		//If I have a String that is a number and I want to sommer this number with another one, what should I do??
		//At first, we will need to use the Intenger funcion -> parseInt = analyzes as a Intenger number
		
		String str1 = "100";
		
		System.out.println(str1 + 5); 	
		/*In the theory, this should be equal to 105, but the program sees it as a concatenation of one string
		 with one int value, what results in 1005 -> "100" + 5*/
		
		//To analyze the string as a number we should convert the string to an Intenger value, using a Wrapper method: 
		
		Integer aux = Integer.parseInt(str1);
		
		System.out.println(aux+5);
		
		//or -> We can use the wrapper inside the print instead to create another Intenger variable:
		
		String str2 = "100";
		
		System.out.println(Integer.parseInt(str2)+5);
		
//------------------------------------------------------------------------------------------------------------------------
		/* What we can also do is let the user set the number(as a String value) and chose for what number 
		   it will sommer */
		
		Scanner user = new Scanner(System.in);
		
		String ss = user.nextLine();
		Integer val = Integer.parseInt(ss);
		
		int a = user.nextInt();
		System.out.println(val+a);
		
//Yes, we could only use NextInt() to take int values... but now we are training with wrappers, so it's good to practice
		
		user.close();

	}
}

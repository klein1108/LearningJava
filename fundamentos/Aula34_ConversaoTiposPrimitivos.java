package fundamentos;

public class Aula34_ConversaoTiposPrimitivos {

	public static void main(String[] args) {
			
		double a = 1;	/* Here we have an implicit conversion from int to double made by Java
		 														 -> double has floating point 	- OK!
																 -> double is greater than int	- OK! */
		System.out.println(a);
		
		float b = (float)1.0;		/* Here we have an explicit conversion from double to float made by the developer
		 														-> float has floating point as double - OK! 
		 														-> float is lesser than double        - FAIL 
		 														
This explicit conversion can be (made)/(done) by just putting the letter F after the number(The most commum and
 the easiest way):
			
			* float b = 1.0F;

Or it can be (made)/(done) by casting that is when you put the wanted typy before the number:
			
			*float b = (float)1.0;

*/
			System.out.println(b);
			
			//But if I put a greater value than a float variable support, the value will be printed incomplete 
			 
			b = 1.123456788888F;
			System.out.println(b);
			
			int c = 4;
			byte d = (byte)c; /*This is an explicit conversion that the user need to do. But is 4 greater than the maximum
			 			 	     value of the byte variable? -> No! It's way lesser than this, but the Java don't analyze
			 				    the values/numbers... he analyzes the type, and the byte type is lesser than the int type,
			 				    so the user must do the explicit conversion*/
			System.out.println(d);
			
			//But if I put a greater value than a byte variable support, the value will be printed incomplete
			c = 128;
			d = (byte)c;
			System.out.println(d); /* Okay that the result is different of the expected one, but Why is it a negative
									  value?
										It's a negative value because the number did its full count and returned from
										the begining of the count, like:
										
										byte-> min value: -128 || max value: 127
										
										c= 128 -> 127+1, so the variable did its full count and add one (= +1), so it
										returned to it minimal value ==> -128
										
										c = 130 -> 127 + 3, so the variable did its full count and add three (= +3), so
										it returned to it minimal value plus 2 ==> -126
										
										
									*/
			
			
			
	}
}

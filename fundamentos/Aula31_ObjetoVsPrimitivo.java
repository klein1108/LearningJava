package fundamentos;

public class Aula31_ObjetoVsPrimitivo {
	
	public static void main(String[] args) {
		
		String s = new String("texto");		//Object type
		
		//or String s = "texto";	-> It's more common	 
		
	//The object types can interact with methods
		s.toUpperCase();
		
		int a=10;				//Primitive type
		System.out.println(a);
		
	/*The primitve types can't interact with mathod, they just carry the information of themselves
	 * 
	 * a. (No results found/No default Proposals)
	 * */
	
		//Wrappers -> The "Object version" of the primitive types
	
	}
}	

package fundamentos;

public class ProjetoXor {
	public static void main(String[] args) {
		
  		int x=5;
		int y=2;
			
		String numb1=Integer.toBinaryString(x);
		String numb2=Integer.toBinaryString(y);
		
		System.out.println("Default:\n"+x+"\t"+numb1);
		System.out.println(y+"\t"+numb2);		
		
		x=(x+y);
		System.out.println("x=(x+y):\n"+x+"\t"+numb1);
		System.out.println(y+"\t"+numb2);	
		y=(x-y);
		System.out.println("y=(x-y):\n"+x+"\t"+numb1);
		System.out.println(y+"\t"+numb2);	
		x=(x-y);
		
		System.out.println("x=(x-y):\n"+x+"\t"+numb1);
		System.out.println(y+"\t"+numb2);	

	}
}

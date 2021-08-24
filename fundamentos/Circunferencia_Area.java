package fundamentos;

public class Circunferencia_Area {
	
	public static void main(String[] args) {
		int raio = 5;
		final double PI = 3.14;				//final "type_var" "name_var" -> Constant Variable
		
		//double area = (raio*raio*PI);
		
		System.out.println("Valor de Area da Circunferencia com Raio = 5m");
		System.out.println("Area = "+(PI*raio*raio)+" m^2");
		//System.out.println("Area = "+area+" m^2");
	}
}

package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
//-----|Part 1|----------------------------------------------------------
		System.out.println("Olá pessoal".charAt(2));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s+"!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.equals("Boa tarde"));
		System.out.println(s.equalsIgnoreCase("bOa TaRdE"));

//-----|Part 2|----------------------------------------------------------
		var nome = "Lucas";			//the variable related the type of itself with the defined value (string)
		var sobrenome = "Klein";	//the variable related the type of itself with the defined value (string)
		var idade = 20;
		var salario = 5000.89;		//The variable relates the decimal value as a Double type, if I want a float type I need to put F in the end		
		
//-----|Part 3|----------------------------------------------------------
		System.out.println("Nome: "+nome+"\nSobrenome: "+sobrenome+"\nIdade: "+idade+"\nSalário: "+salario);
		System.out.printf("Nome: %s \n",nome);
		
//-----|Part 4|----------------------------------------------------------
		System.out.printf("O senhor %s %s tem %d anos e ganha um salario de R$%.2f.\n\nquem dera\n",nome,sobrenome,idade,salario);
		
		String frase= String.format("O senhor %s %s tem %d anos e ganha um salario de R$%.2f.\n\nquem dera\n",nome,sobrenome,idade,salario);
		System.out.println(frase);
		
		String MaisUmaFrase = "Nome: "+nome+"\nSobrenome: "+sobrenome+"\nIdade: "+idade+"\nSalario: "+salario;
		System.out.println(MaisUmaFrase);
		
//-----|Part 5|----------------------------------------------------------
		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6));
		System.out.println("Frase qualquer".substring(6,10));
		
	}
}

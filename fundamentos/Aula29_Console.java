package fundamentos;

import java.util.Scanner;


public class Aula29_Console {

	public static void main(String[] args){
//----|Parte 1|------------------------------------------------------------
		System.out.print("Bom");
		System.out.print(" dia!\n");
		
		System.out.println("Bom");
		System.out.println("dia!!\n");
		
		System.out.printf("Megasena: %d %d %d %d %d %d",1,2,3,4,5,6);
		System.out.printf("Salário: R$%.1f\n",500.56);
		System.out.printf("Nome: %s","Joao");
		
//----|Parte 2|------------------------------------------------------------
		Scanner entrada = new Scanner(System.in);			/*Using the Scanner to take informations from the user
		Type    Name    = new Scanner(System.in) -> System.in because we want give an information to the computer, using the user keybord -> an "In system" */
		
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();					//entrada -> scanner .nextLine() -> scanner for Strings variables = String name -> saving on a string var
		
		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();				//entrada -> scanner .nextLine() -> scanner for Strings variables = String sobrenome -> saving on a string var
		
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();						//entrada -> scanner .nextInt() -> scanner for Integer variables = int idade -> saving on a integer var
		
		System.out.printf("Seu nome é %s %s e voce tem %d anos",nome,sobrenome,idade);
		entrada.close();									//closing the scanner because we don't need it anymore.
		
	}
}

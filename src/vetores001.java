import java.util.Scanner;
public class vetores001 {

	public static void main(String[] args) {
		
		
		//Programa que lê um numero inteiro positivo N(maximo=10) e depois N numeros inteiros 
		//e armazene-os em um vetor. mostrar na tela todos os numeros negativos lidos
		
		
		
		
		Scanner in = new Scanner(System.in);
		
		//System.out.println("Quantos números você vai digitar?");
		//int qtd = in.nextInt();
		//int[] num = new int[qtd];
		//for(int i = 0 ; i < qtd; i++) {
		//System.out.println("Digite um número");
		//num[i] = in.nextInt();
		//}
		//for(int i = 0; i < qtd; i++) {
		//if(num[i] < 0) {
		//	  System.out.println(num[i]);
	    //}
	    		                                                                                                                                                                             
			  
		
		System.out.println("Quantas pessoas são?");
		int qtd = in.nextInt();
		String nome[] = new String[qtd];
		int idade[] = new int[qtd];
		
		for( int i = 0; i < idade.length; i++) {
			System.out.println("Digite o nome da pessoa ");
			nome[i] = in.next();
			System.out.println("qual a idade da pessoa ");
			idade[i] = in.nextInt();
		}
		for(int i = 0; i < idade.length; i++) {
			if(idade[i] < 18) {
				System.out.println("o(a) " + nome[i] + " é menor de 18!");
			}
		}
		
				
		
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
			  
		}
		
		
	}



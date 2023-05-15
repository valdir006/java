import java.util.Scanner;
public class idade {

	public static void main(String[] args) {
		
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("quantas pessoas serão:");
		int qtd = in.nextInt();
		String []nome =new String [qtd];
		int [] idade = new int [qtd];
		
		for(int i = 0; i< nome.length;i++ ) {
			System.out.println("qual o nome da pessoa #" + (i+1) + ":");
			nome[i]= in.next();
			System.out.println("qual a idade da pessoa #" + (i+1) + ":");
			idade[i]= in.nextInt();
		}
		for (int i = 0; i< nome.length;i++) {
			if(idade[i] <18) {
				System.out.println("o(a)" + nome[i] + " tem " + idade[i] + " anos e não pode beber pois é mirim");
			}
		}
		
		
		

	}

}

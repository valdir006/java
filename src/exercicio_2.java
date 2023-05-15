import java.util.Scanner;

public class exercicio_2 {

	public static void main(String[] args) {

		//Scanner in = new Scanner(System.in);
		
		int num = 1, soma = 0;
		while(num<=15) {
			soma = soma+num;
			num = num+1;
		}
		System.out.println("a soma dos números é igual a "+soma);
	}

}

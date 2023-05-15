import java.util.Scanner;
public class exercicio_3 {

	public static void main(String[] args) {
		
		
		
		Scanner in = new Scanner (System.in);
		System.out.println("Digite seu nome");
		String nome= in.next();
		int num = 0;
		while(num<=10) {
			System.out.println(nome); num++;
		}

	}

}

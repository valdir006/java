import java.util.Scanner;

public class vetores {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int num[] = new int [6];
		for(int i = 0; i<6; i++) {
			System.out.println("Digite um número");
			num[i] = in.nextInt();			
		}
		for(int i = 0; i<6; i++) {
			System.out.println(num[i]);
		}
		


	}
	
}

import java.util.Scanner;
public class questão_02 {

	public static void main(String[] args) {

		
		
		Scanner in = new Scanner (System.in);
		System.out.println("Digite três números");
		int media, maior, menor = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		if(a > b) {
		}	if(a > c) {
			maior = a;
		}else {
			maior = c;
		}
		 if(b > c) {
			maior = b; 
		}else {
			maior = c;
		}
		System.out.println("maior");
	}

}

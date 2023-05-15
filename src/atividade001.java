import java.util.Scanner;
public class atividade001 {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("Digite dois Números");
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		if(num1<num2) { 
			for(int x = num1; x <= num2; x++) {
				System.out.println(x);
			}
			}else {
				for(int x = num2; x <= num1; x++) 
					System.out.println( x);
			}
		
		
		
		
	}

	}

import java.util.Scanner;
public class atividade005 {

	public static void main(String[] args) {
		
		

	Scanner in = new Scanner(System.in);
	System.out.println("Digite dois números e descubra se são múltiplos:");
	int num1 = in.nextInt();
	int num2 = in.nextInt();
	if(num1 % num2 == 0 || num2 % num1 == 0) {
	System.out.println("São múltiplos!");
	}
		
		
	}

}

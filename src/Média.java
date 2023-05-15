import java.util.Scanner;

public class Média {

public static void main(String[] args) {
	
	
	Scanner in = new Scanner (System.in);
	System.out.println("Digite um número");
	int num = in.nextInt();
	if (num % 10 == 0) {
	System.out.println("Divisível por 10");
	}
    if(num % 5 == 0) {
	System.out.println("Divisível por 5");
	}
    if(num % 2 == 0) {
	System.out.println("Divisível por 2");
	} else {
		System.out.println("número não divisível");
	}
	 
    
    }

}

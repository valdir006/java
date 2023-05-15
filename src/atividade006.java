import java.util.Scanner;
public class atividade006 {

	public static void main(String[] args) {

	Scanner in = new Scanner(System.in);
	
	System.out.println("Quantos animais de estimação você tem?");
	int qdtAnimais = in.nextInt();
	String animal[] = new String[qdtAnimais];
	for (int i = 0; i < animal.length; i++) {
	System.out.println("Digite o nome de um animal");	
	animal[i] = in.next();
	}
	for(int i = 0; i < animal.length; i++) {
	System.out.println(animal[i]);	
	}
		
		
		
		
		
	}

}

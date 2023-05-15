import java.util.Scanner;
public class Matriz {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		String [][] nomes = new String[3][3];
		for (int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.println("Digite uma palavra");
				nomes[i][j] = in.next();
			}
		}

		

	}

}

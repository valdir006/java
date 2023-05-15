import java.util.Scanner;
public class vetores3 {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		String [] meses= {"jan","fev","mar","abr","mai","jun","jul","ago","set","out","nov","dez"};
		System.out.println("Digite um número");
		int num = -1;
		while(num != 0) {
	    num = in.nextInt();
		
		switch (num) {
		
		case 0:
		System.out.println(meses[num]);break;
		case 1:
			System.out.println(meses[num]);break;
		case 2:
			System.out.println(meses[num]);break;
		case 3:
			System.out.println(meses[num]);break;
		case 4:
			System.out.println(meses[num]);break;
		case 5:
			System.out.println(meses[num]);break;
		case 6:
			System.out.println(meses[num]);break;
		case 7:
			System.out.println(meses[num]);break;
		case 8:
			System.out.println(meses[num]);break;
		case 9:
			System.out.println(meses[num]);break;
		case 10:
			System.out.println(meses[num]);break;
		case 11:
			System.out.println(meses[num]);break;
			default:
		    System.out.println("Inválido");
		}
		}

	}

}

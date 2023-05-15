import java.util.Scanner;
public class exercicio_5 {

	public static void main(String[] args) {
		
		
		
		Scanner in = new Scanner (System.in);
		int  soma, n1, n2, n3, n4, n5, n6, n7, n8, n9, n10;
		System.out.println("digite 10 números e veja a soma");
		n1= in.nextInt();
		n2= in.nextInt();
		n3= in.nextInt();
		n4= in.nextInt();
		n5= in.nextInt();
		n6= in.nextInt();
		n7= in.nextInt();
		n8= in.nextInt();
		n9= in.nextInt();
		n10= in.nextInt();
		soma = n1+n2+n3+n4+n5+n6+n7+n8+n9+n10;
		System.out.println("a soma dos números é igual a "+soma);

	}

}

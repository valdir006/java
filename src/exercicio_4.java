import java.util.Scanner;
public class exercicio_4 {

	public static void main(String[] args) {
		int cont =0;
		Scanner in = new Scanner (System.in);
		System.out.println("Digite seu nome");
		String nome= in.next();
		System.out.println("Digite um número");
		String letra = in.next();
		//while (cont <= num) {
		//	System.out.println(nome);
		//	cont++;
		//}
		for(int i = 0;i<nome.length();i++) {
			
			if (letra.equals(nome.charAt(i)+"")) {
				//System.out.println(letra);
				cont++;
			}
		}
		System.out.println("A quantidade de vezes é: "+cont);

	}

}

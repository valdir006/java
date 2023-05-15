import java.util.Scanner;
public class atividade002 {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
        //System.out.println("Digite seu peso");
		//double peso = in.nextFloat();
		//System.out.println("Digte sua altura");
		//double altura = in.nextFloat();
		
		//double imc = peso/(altura*altura);
		//if(imc <= 18.5) {
		//System.out.println("Abaixo do peso!!");
		//}else if(imc > 18.5 && imc <= 24.9) {
	   // System.out.println("Peso normal");
		//}else if(imc > 25 && imc <= 29.9) {
		//System.out.println("Sobrepeso");
		//}else if(imc > 30 && imc <= 34.9) {
		//System.out.println("Obesidade grau 1");
		//};
		
		//3-
		
		System.out.println("Quantas pessoas você quer informar?");
		int pessoas = in.nextInt();
		String nome[] = new String[pessoas];
		int idade[] = new int[pessoas];
		for(int x = 0; x < idade.length; x++) {
		System.out.println("Qual o nome da pessoa"+x+1);
		System.out.println("Qual a idade da pessoa"+x+1);
		idade[x] = in.nextInt();
		}for(int x = 0; x <idade.length; x++){
		if(idade[x] > 18) {
		System.out.println(nome[x]);
		}
		}
		
		
		
		
		
		
		
		
	}

}

import java.util.Scanner;
public class atividade008 {

	public static void main(String[] args) {
	
	//fazer um programa para ler as medidas de dois triângulos e retornar qual é maior
		
		Scanner in = new Scanner(System.in);
		System.out.println("digite a medida do triângulo 1");
		int xA = in.nextInt();
		int xB = in.nextInt();
		int xC = in.nextInt();
	    System.out.println("Digite a medida do triângulo 2");
	    int yA = in.nextInt();
	    int yB = in.nextInt();
	    int yC = in.nextInt();
	    double pX= (xA + xB + xC)/2;
	    double pY= (yA + yB + yC)/2;
	    double areaX = Math.sqrt(pX*(pX - xA)*(pX - xB)*(pX - xC));
	    double areaY = Math.sqrt(pY*(pY - yA)*(pY - yB)*(pY - yC));
	    System.out.println("A area do triângulo 1 é " +areaX);
	    System.out.println("A area do triângulo 2 é " +areaY);
	    if(areaX > areaY) {
	    	System.out.println("A area do triângulo 1 é maior");
	    }else {
	    	System.out.println("A area do triÂngulo 2 é maior");
	    }
	    
	    
	    
	    
	    
	    
	    
	}
}

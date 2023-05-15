import java.util.Scanner;

import entidades.Produto;

public class produto {

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite as informações do produto");
		System.out.println("Nome");
		String nome = in.next();
		System.out.println("Preço");
		double preço = in.nextDouble();
		//System.out.println("Quantidade");
		//prod.quantidade = in.nextInt();
		Produto prod = new Produto(nome, preço);
		System.out.println("Digite uma quantidade a ser adicionada:");
		int quant = in.nextInt();
		prod.AddProduto(quant);
		//System.out.println("Informações Atualizadas: "+ prod.nome +" Quantidade: "+prod.quantidade +" Valor total: "+prod.ValorTotal());
		System.out.println("Digite uma quantidade a ser removida:");
		quant = in.nextInt();
		prod.RemoveProduto(quant);
		
		
		
		in.close();
		
		

	}

}

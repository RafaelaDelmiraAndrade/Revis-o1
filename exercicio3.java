import java.util.Scanner;
public class Exercicio3 {
	public static void main (String[]args) {
		Scanner in = new Scanner (System.in);
		double precoProduto, marLucro, precoVenda, lucro, i, res;
		String ns;

			do{
			
				System.out.println("Entre com o preço do produto.");
				precoProduto = in.nextDouble();
				
				System.out.println("Entre com a margem de lucro.");
				marLucro = in.nextDouble();
				
				lucro = precoProduto / 100 * marLucro;
				
				precoVenda = precoProduto - lucro;
				
				System.out.println("O total da sua venda é de :" +precoVenda);
				
				System.out.println("Deseja continuar calculando? Se sim digite S, se não N.");
				ns = in.next();
		
			}while(ns.equals("s"));
			 
		}
	}


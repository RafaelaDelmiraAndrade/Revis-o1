import java.util.Scanner;
public class Exercicio1 {
	public static void main(String[]args) {
		Scanner in = new Scanner (System.in);
		
		double horaAula, numeAulas, descont, result, sal, total;
		
		System.out.println("Digite o valor da hora aula.");
		horaAula = in.nextDouble();
		
		System.out.println("Digite o número de aulas dada no mês.");
		numeAulas= in.nextDouble();
		
		System.out.println("Digite o percetual de desconto INSS.");
		descont = in.nextDouble();
		
		result = horaAula * numeAulas;
		
		sal = result / 100 * descont;
		
		total = result - sal;
		
		System.out.println("O salário líquido é de: " +total);
	}
}

import java.util.Scanner;
public class Exercicio5 {
	public static void main(String[]args) {
		Scanner in = new Scanner (System.in);
		
		double horaAula, numeAulas, descont, result, sal, total;
		
		System.out.println("Digite o valor da hora aula.");
		horaAula = in.nextDouble();
		
		System.out.println("Digite o número de aulas dada no mês.");
		numeAulas= in.nextDouble();
		
		result = horaAula * numeAulas;
		
		if(result <= 1.212){
			sal = result / 100 * 7.5;
		}else if(result <= 2427.35) {
			sal = result / 100 * 9;
		}else if(result <= 3641.03) {
			sal = result / 100 * 12;
		}else if(result <= 7087.22) {
			sal = result / 100 * 14;
		}else if(result <= 12136.79) {
			sal = result / 100 * 14.5;
		}else if(result <= 24273.57) {
			sal = result / 100 * 16.5;
		}else if(result <= 47333.46) {
			sal = result / 100 * 19;
		}else {
			sal = result / 100 * 22;
		}
		
		total = result - sal;
			
		System.out.println("O salário líquido é de: " +total);
	}
}

import java.util.Scanner;
public class Exercicio2 {
	public static void main(String[]args) {
		Scanner in = new Scanner(System.in);
		int i = 0, num;
		
		System.out.println("Digite o número que você deseja inverter:");
		num = in.nextInt();
		
		while(num > 0) {
			i = i * 10;
			i = i + (num % 10);
			num = num / 10;
		}
		
		System.out.println("O número invertido é: "+i);
	}
}

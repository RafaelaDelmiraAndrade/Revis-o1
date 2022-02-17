import java.util.Scanner;
public class Exercicio4 {
	public static void main(String[]args) {
		Scanner in = new Scanner (System.in);
		int a[], b[],c[], i;
		
		a = new int [4];
		b = new int [4];
		c = new int [4];
		
		for (i=0; i<4; i++) {
			System.out.println("Entre com o "+(i+1)+"° valor do vetor A.");
			a[i] = in.nextInt();
		}
		
		for (i=0; i<4; i++) {
			System.out.println("Entre com o "+(i+1)+"° valor do vetor B.");
			b[i] = in.nextInt();	
		}
		
		for (i=0; i<4; i++) {
			c[i] = (a[i] + b[i]);
			System.out.println("A soma de "+(a[i])+" + "+(b[i])+" é igual a: "+(c[i]));
		}
		
	}
}

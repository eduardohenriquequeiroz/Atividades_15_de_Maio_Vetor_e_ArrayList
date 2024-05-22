package vetoresEarraylist;

import java.util.Scanner;

public class Vetor04 {

	public static void main(String[] args) {

		int a[] = new int [5];
		int soma = 0;

		Scanner ler = new Scanner(System.in);

		for (int i = 0; i< 5; i++) {
			System.out.println("Informe um número " + i + "..i");
			a[i] = ler.nextInt(); 
			soma += a[i];}
		
		if (soma > 30) {
			System.out.println("A soma é: " + soma); }
		
		else {
			System.out.println("A soma é menor que 30, pois o resultado é: " + soma); }
		
		ler.next();
	}
}
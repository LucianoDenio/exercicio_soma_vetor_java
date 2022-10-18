package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar? " );
		int n = sc.nextInt();
		
		double[] value = new double[n];
		
		for (int i=0;i<value.length;i++) {
			System.out.print("Digite um número: ");
			value [i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		
		for(int i=0;i<value.length;i++) {
			sum += value[i];
		}
		
		double media = sum/value.length;
		
		System.out.print("Valores = ");
		for(int i=0;i<value.length;i++) {
			System.out.printf("%.2f ", value[i]);
		}
		
		System.out.println();
		
		System.out.printf("Soma = %.2f%n ", sum);
		System.out.printf("Media = %.2f%n ", media);
		
		sc.close();

	}

}

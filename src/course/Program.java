package course;

import java.util.Locale;
import java.util.Scanner;

import application.Product;

public class Program {

	public static void main(String[] args) {
		
		/*String original = "abcde FGHIJ ABC abc DEFG      ";
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2, 9);
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xy");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		System.out.println("Original -" + original + "-");
		System.out.println("toLowerCase -" + s01 + "-");
		System.out.println("toUpperCase -" + s02 + "-");
		System.out.println("trim " + s03 + "-");
		System.out.println("substring(2) -" + s04 + "-");
		System.out.println("substring(2, 9) -" + s05 + "-");
		System.out.println("replace(a, x) -" + s06 + "-");
		System.out.println("replace(abc, xy) -" + s07 + "-");
		System.out.println("Index of 'bc': " + i);
		System.out.println("Last of 'bc': " + j);
		
		String s = "potato apple lemon orange";
		String[] vect = s.split(" ");
		System.out.println(vect[0]);
		System.out.println(vect[1]);
		System.out.println(vect[2]);
		System.out.println(vect[3]);
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] vect = new double[n];
		for (int i=0; i<n; i++) {
		vect[i] = sc.nextDouble();
		}
		double sum = 0.0;
		for (int i=0; i<n; i++) {
		sum += vect[i];
		}
		double avg = sum / n;
		System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
		sc.close();
		*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Product[] vect = new Product[n];
		for (int i=0; i<vect.length; i++) {
		sc.nextLine();
		String name = sc.nextLine();
		double price = sc.nextDouble();
		vect[i] = new Product(name, price);
		}
		double sum = 0.0;
		for (int i=0; i<vect.length; i++) {
		sum += vect[i].getPrice();
		}
		double avg = sum / vect.length;
		System.out.printf("AVERAGE PRICE = %.2f%n", avg);
		sc.close();
		
	}

}

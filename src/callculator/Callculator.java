package callculator;

import java.util.Scanner;

public class Callculator {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Kullanmak istediðiniz iki sayýyý seçiniz.");
		
		System.out.println("Birinci Sayý:");
		int sayý1 = sc.nextInt();
		System.out.println("Ýkinci sayý:");
		int sayý2 = sc.nextInt();
		
		System.out.println("Yapmak istediðiniz iþlemi tuþlayýnýz.");
		System.out.println("1.Toplama");
		System.out.println("2.Çýkarma");
		System.out.println("3.Çarpma");
		System.out.println("4.Bölme");
		
		
		

		
		
		int op = sc.nextInt();

		
		switch (op) {
		case 1:
			System.out.println("Sonuç= " + addition(sayý1, sayý2));
			break;
		case 2:
			System.out.println("Sonuç= " + substraction(sayý1, sayý2));

			break;
		case 3:
			System.out.println("Sonuç= " + multiplication(sayý1, sayý2));

			break;
		case 4:
			System.out.println("Sonuç= " + division(sayý1, sayý2));

			break;

		default:
			break;
		}

	}

	public static int addition(int a, int b) {

		return a + b;
	}

	public static int substraction(int a, int b) {

		return a - b;

	}

	public static int multiplication(int a, int b) {

		return a * b;

	}

	public static int division(int a, int b) {
		if (b != 0) {
			return a / b;
		}

		else
			return 0;
	}

}

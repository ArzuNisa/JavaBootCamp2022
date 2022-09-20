import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char harf = input.next().charAt(0);
		boolean ince = false;
		boolean kalın = false;
		char[] inceSesliler = { 'e', 'i', 'ö', 'ü', 'E', 'İ', 'Ö', 'Ü' };
		char[] kalinSesliler = { 'a', 'ı', 'o', 'u', 'A', 'I', 'O', 'U' };

		for (char letter : inceSesliler) {
			if (letter == harf) {
				ince = true;
			}
		}
		for (char letter : kalinSesliler) {
			if (letter == harf) {
				kalın = true;
			}
		}

		if (ince) {
			System.out.println("harfiniz ince sesli");

		} else if (kalın) {
			System.out.println("Harfiniz kalın sesli");
		} else {
			System.out.println("Sesli harf girmediniz.");
		}

	}

}

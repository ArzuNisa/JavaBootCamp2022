import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a Number thar you want learn is Prime or not Prime :");
		int number = input.nextInt();

//		int number = 25;
		int remainder = 0;

		for (int i = 2; i < number; i++) {
			remainder = number % i;
			if (remainder == 0) {
				System.out.println("Asal Sayıdır değildir");
				break;
			}
		}
		if (remainder != 0) {
			System.out.println("Asal Sayıdır");
		}

	}

}

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a Number thar you want learn is Perfect number or not :");
		int number = input.nextInt();
		int remainder = 0;
		int total = 0;

		for (int i = 1; i < number; i++) {
			remainder = number % i;
			if (remainder == 0) {
				total = total + i;
			}
		}

		if (number == total) {
			System.out.println("Number is the perfect number");
		}
		else {
			System.out.println("Number is not a perfect number");
		}

	}

}

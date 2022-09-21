
public class Main {

	public static void main(String[] args) {
		int number1 = 220, total1 = 0;
		int number2 = 284, total2 = 0;
		int reminder = 0;
		for (int i = 1; i < number1; i++) {
			reminder = number1 % i;
			if (reminder == 0) {
				total1 = total1 + i;
			}
		}

		for (int i = 1; i < number2; i++) {
			reminder = number2 % i;
			if (reminder == 0) {
				total2 = total2 + i;
			}
		}
		if (number1 == total2 && number2 == total1) {
			System.out.println("Numbers are friend numbers.");
		} else {
			System.out.println("Numbers are not friend numbers.");
		}

	}

}

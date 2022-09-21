
public class Main {

	public static void main(String[] args) {
		int [] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak = 5;
		int control=0;
		for (int i = 0; i < sayilar.length; i++) {
			if(sayilar[i]==aranacak) {
				System.out.println("Sayı var");
				control=1;
			}
		}
		if(control==0) {
			System.out.println("Sayı yok");
		}

	}

}

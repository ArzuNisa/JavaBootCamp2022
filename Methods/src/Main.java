
public class Main {

	public static void main(String[] args) {
		sayiBulmaca();

	}
//	Javada fonksiyon yerine method demis

	public static void sayiBulmaca() {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 5;

		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}
		
		String mesaj="";
		if (varMi) {
			mesaj = "Sayı var: " + aranacak;
			mesajVer(mesaj);
		} else {
			System.out.println("Sayı yok: " + aranacak);
		}
	}

	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);

	}

}

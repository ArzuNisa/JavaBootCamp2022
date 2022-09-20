
public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj);

		System.out.println("Eleman sayısı : " + mesaj.length());
//		stringin uzunluğunu bulur
		
		System.out.println("5. eleman : " + mesaj.charAt(4));
//	    charAt fonksiyonu istediğimiz elemanı verir

		System.out.println(mesaj.concat(" Yaşasın!"));
//		concat yeni bir string oluşturarak birleştirir
		System.out.println(mesaj);

		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.endsWith("."));
//		startsWith ve endsWith true ya da false döndürür

		char[] karakterler = new char[5];
		mesaj.getChars(0, 4, karakterler, 0);
		System.out.println(karakterler);

		System.out.println(mesaj.indexOf('a'));
//		istediğimiz karakterin indeksini verir
		System.out.println(mesaj.lastIndexOf('a'));
//		sağdan saymaya başlayıp indeksi döndürür	
		
		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);
//	    istediğimizi değiştirir
		
		System.out.println(mesaj.substring(2));
		System.out.println(mesaj.substring(2,5));
//		stringi keser
		
		for(String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
//		istediğimiz karaktere göre stringi keser
		
		System.out.println(mesaj.toLowerCase());
//		mesajı küçük harfe çevirir
		System.out.println(mesaj.toUpperCase());
//		mesajı büyük harfe çevirir
		
		System.out.println(mesaj.trim());
//		stringin başındaki ve sonundaki boşlukları siler
	}

}

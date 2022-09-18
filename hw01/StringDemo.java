package hw01;

public class StringDemo {

	public static void main(String[] args) {

		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj);

		/*
		 * System.out.println("Eleman Sayısı :" + mesaj.length());
		 * System.out.println("5.Eleman :" + mesaj.charAt(4));
		 * System.out.println(mesaj.concat(" Yaşasın!"));
		 * System.out.println(mesaj.startsWith("B"));
		 * System.out.println(mesaj.endsWith(".")); char[] karakterler = new char[5];
		 * mesaj.getChars(0, 5, karakterler, 0); System.out.println(karakterler);
		 * System.out.println(mesaj.indexOf('a')); //kaçıncı karakter ilk bulduğunu
		 * verir. System.out.println(mesaj.lastIndexOf('a'));
		 */

		System.out.println(mesaj.replace(' ', '-'));
		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);

		System.out.println(mesaj.substring(6));
		System.out.println(mesaj.substring(2, 5));
		System.out.println("-----------------------");

		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}

		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.trim());

	}

}

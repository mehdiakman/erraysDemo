package sayiBulmaa;

public class sayiBulma {

	public static void main(String[] args) {

		int [] sayilar = new int [] {1,2,5,7,9};
		int aranacak = 5;
		
		for (int i=1; i<sayilar.length; i++) {
			if(aranacak == i) {
				System.out.println("Sayı bulundu");
			}
			else {
				System.out.println("Sayı bullunmadı");
			}
		}

	}

}

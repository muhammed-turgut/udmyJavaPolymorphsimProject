package Örnek;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Beyblade Programına Hoşgeldiniz");
		System.out.println("Çıkış için q ya basın");
		
		
		while(true) {
			System.out.println("---Hangi Beybladeyi Ürtemek istiyorsunuz---");
			String islem=scanner.nextLine();
			if(islem.equals("q")) {
				System.out.println("Programdan Çıkılıyor...");
				break;
			}
			else {
				BeybladeFabrikası fabrika=new BeybladeFabrikası();
				Beyblade beyblade= fabrika.BeybladeUret(islem);
				if(beyblade==null) {
					System.out.println("Lütfen Geçerli bir bey blade adı girin");
				}
				else {
					beyblade.bilgileriGöster();
					beyblade.saldir();
					beyblade.kutsalCanvarOrtayaCikar();
				}
			}
			
		}
	}

}

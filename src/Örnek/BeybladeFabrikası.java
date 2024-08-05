package Örnek;

public class BeybladeFabrikası {
	public Beyblade BeybladeUret(String beyblad_turu) {
		if(beyblad_turu.equals("Dragon")){
			return new Dragon("Takao", 800, 3000, "Mavi Ejderha", "Kutsal canvar ile konuşma");
		}
		else if(beyblad_turu.equals("Dranza")) {
			return new Dranza("Kai", 700, 400, "Kırmızı Anka");
		}
		else if(beyblad_turu.equals("Drayga")) {
			return new Drayga("Rei", 500, 350, "Beyaz Kaplan");
		}
		else if(beyblad_turu.equals("Draciel")) {
			return new Draciel("Max", 800, 800,"Kara Kaplunbağa" );
		}
		else {
			return null;
		}
	}

}

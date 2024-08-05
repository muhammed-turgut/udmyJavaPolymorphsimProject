package Örnek;

public class Draciel extends Beyblade{
	private String kutsalCanavar;
	public Draciel(String beybladeci,int saldırıGücü,int saldırıHızı,String kutsalCanavar) {
		super(beybladeci,saldırıHızı,saldırıGücü);
		this.kutsalCanavar=kutsalCanavar;
	}
	@Override
	public void bilgileriGöster() {
		super.bilgileriGöster();
		System.out.println("Kutsal Cnavar Adı: "+kutsalCanavar);
	}
	
	@Override
	public void kutsalCanvarOrtayaCikar() {
		System.out.println(getBeybladeci()+""+kutsalCanavar+"i ortaya çıkar");
		System.out.println(getBeybladeci()+"in gzili saldırısı: Alev kılıcı...");
	}
}

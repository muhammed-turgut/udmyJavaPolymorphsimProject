package Örnek;

public class Dranza extends Beyblade {
	private String kutsalCanavar;
	public Dranza(String beybladeci,int saldırıGücü,int donusHizi,String kutsalCnavar) {
		super(beybladeci, donusHizi, saldırıGücü);
		this.kutsalCanavar=kutsalCnavar;
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

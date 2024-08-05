package Örnek;

public class Dragon extends Beyblade {
	private String kutsalCanavar;
	public Dragon(String beybladeci,int saldırıGücü,int saldırıHızı,String kutsalCanavar,String gizliYetenek) {
		super(beybladeci,saldırıGücü,saldırıHızı);
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
		System.out.println(getBeybladeci()+"in gzili saldırısı: Hayalet Kasırgası");
	}

}

package Örnek;

public class Drayga extends Beyblade{
	private String KutsalCanvar;
	public Drayga(String Beybladeci,int saldırıGücü,int saldırıHızı,String KutsalCanvar) {
		super(Beybladeci,saldırıHızı,saldırıGücü);
		this.KutsalCanvar=KutsalCanvar;
	}
	
	@Override
	public void bilgileriGöster() {
		super.bilgileriGöster();
		System.out.println("Kutsal Cnavar Adı: "+KutsalCanvar);
	}
	
	@Override
	public void kutsalCanvarOrtayaCikar() {
		System.out.println(getBeybladeci()+""+KutsalCanvar+"i ortaya çıkar");
		System.out.println(getBeybladeci()+"in gzili saldırısı: Alev kılıcı...");
	}

}

package Örnek;

public class Beyblade {
	private String beybladeci;
	private int donusHizi;
	private int saldiriGücü;
	
	public Beyblade(String beybladeci,int donusHizi,int saldiriGücü) {
		this.beybladeci=beybladeci;
		this.donusHizi=donusHizi;
		this.saldiriGücü=saldiriGücü;
		
	}
	
	public String getBeybladeci() {
		return beybladeci;
	}
	public void setBeybladeci(String beybladeci) {
		this.beybladeci = beybladeci;
	}
	
	
	public int getDonusHizi() {
		return donusHizi;
	}
	public void setDonusHizi(int donusHizi) {
		this.donusHizi = donusHizi;
	}
	
	
	public int getSaldiriGücü() {
		return saldiriGücü;
	}
	public void setSaldiriGücü(int saldiriGücü) {
		this.saldiriGücü = saldiriGücü;
	}
	
	public void saldir() {
		System.out.println(getBeybladeci()+""+saldiriGücü+"ve"+donusHizi+"ile saldırıyor...");
		
	}
	public void kutsalCanvarOrtayaCikar(){
		System.out.println("Bu bebaldenin kutsal canvarı bulunuyor...");
		
		
	}
	public void bilgileriGöster() {
		System.out.println("Beybladeci İsmi: "+beybladeci);
		System.out.println("Saldırı Gücü: "+saldiriGücü);
		System.out.println("Donus Hizi: "+donusHizi);
		
	}
	
	

}

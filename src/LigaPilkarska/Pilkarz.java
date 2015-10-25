package LigaPilkarska;

public class Pilkarz {
	
	private int id=1;
	private String imie;
	private String nazwisko;
	private String pozycja;
	private String klub;
	
	//Setters & Getters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getImie() {
		return imie;
	}
	public void setImie(String imie) {
		this.imie = imie;
	}
	public String getNazwisko() {
		return nazwisko;
	}
	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}
	public String getPozycja() {
		return pozycja;
	}
	public void setPozycja(String pozycja) {
		this.pozycja = pozycja;
	}
	public String getKlub() {
		return klub;
	}
	public void setKlub(String klub) {
		this.klub = klub;
	}
	
	//Konstruktor
	public Pilkarz (int id, String imie, String nazwisko, String pozycja, String klub){
		this.setId(id);
		this.setImie(imie);
		this.setNazwisko(nazwisko);
		this.setPozycja(pozycja);
		this.setKlub(klub);
	}
	//info o pilkarzu
	public void PracownikInfo() {
		String Info = "id: "+id+" Imie : " + imie + "   nazwisko : " + nazwisko + "    pozycja : "
				+ pozycja + "  klub: " + klub;
		System.out.println(Info);
	}
	
	
}

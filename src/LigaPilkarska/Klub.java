package LigaPilkarska;

public class Klub {
	
	private int id;
	private String nazwa;
	private int rokZalozenia;
	private String barwy;
	
	//Kontruktor
	public Klub( int id, String nazwa, int rokZalozenia, String barwy ){
		this.setId(id);
		this.setNazwa(nazwa);
		this.getRokZalozenia();
		this.setBarwy(barwy);
	}
	
	//Setters & Getters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNazwa() {
		return nazwa;
	}
	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}
	public int getRokZalozenia() {
		return rokZalozenia;
	}
	public void setRokZalozenia(int rokZalozenia) {
		this.rokZalozenia = rokZalozenia;
	}
	public String getBarwy() {
		return barwy;
	}
	public void setBarwy(String barwy) {
		this.barwy = barwy;
	}
	
	//info o Klubie
	public void KlubInfo() {
		String Info = "id: "+ id + " nazwa: " + "rok za³o¿enia: " + " barwy: " + barwy;
		System.out.println(Info);
	}

}

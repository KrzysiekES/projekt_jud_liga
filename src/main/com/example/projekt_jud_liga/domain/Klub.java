package main.com.example.projekt_jud_liga.domain;


public class Klub {
	
	private long id;
	
	private String nazwa;
	private int rokZalozenia;
	private String barwy;
	
	//Kontruktor
	public Klub( String nazwa, int rokZalozenia, String barwy ){
		super();
		this.setNazwa(nazwa);
		this.getRokZalozenia();
		this.setBarwy(barwy);
	}
	
	public Klub() {
		super();
	}

	//Setters & Getters
	public long getId() {
		return id;
	}
	public void setId(long id) {
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

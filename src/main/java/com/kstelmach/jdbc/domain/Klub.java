package main.java.com.kstelmach.jdbc.domain;


public class Klub {
	
	private int id;
	
	private String nazwa;
	private String barwy;
	
	//Kontruktor
	public Klub( String nazwa, String barwy ){
		super();
		this.setNazwa(nazwa);
		this.setBarwy(barwy);
	}
	
	public Klub() {
		super();
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
	public String getBarwy() {
		return barwy;
	}
	public void setBarwy(String barwy) {
		this.barwy = barwy;
	}
	
	//info o Klubie
	public void KlubInfo() {
		String Info = "id: "+ id + " nazwa: " + " barwy: " + barwy;
		System.out.println(Info);
	}

}

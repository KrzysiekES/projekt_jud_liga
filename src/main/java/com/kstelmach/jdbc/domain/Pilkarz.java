package main.java.com.kstelmach.jdbc.domain;


public class Pilkarz {
	
	private long id;
	
	private int idKlubu;
	private String imie;
	private String nazwisko;
	private String pozycja;
	
	//Setters & Getters
	public long getId() {
		return id;
	}
	public void setId(long id) {
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

	//Konstruktor
	public Pilkarz (int id,int idKlubu, String imie, String nazwisko, String pozycja){
		this.setId(id);
		this.setIdKlubu(idKlubu);
		this.setImie(imie);
		this.setNazwisko(nazwisko);
		this.setPozycja(pozycja);
	}
	
	public Pilkarz (int idKlubu, String imie, String nazwisko, String pozycja){
		super();
		this.setIdKlubu(idKlubu);
		this.setImie(imie);
		this.setNazwisko(nazwisko);
		this.setPozycja(pozycja);
	}
	
	
	public Pilkarz() {
		super();
		// TODO Auto-generated constructor stub
	}
	//info o pilkarzu
	public void PilkarzInfo() {
		String Info = "id: "+id + "id klubu: " + idKlubu + " Imie : " + imie + "   nazwisko : " + nazwisko + "    pozycja : "
				+ pozycja ;
		System.out.println(Info);
	}
	public int getIdKlubu() {
		return idKlubu;
	}
	public void setIdKlubu(int idKlubu) {
		this.idKlubu = idKlubu;
	}
	
	
}

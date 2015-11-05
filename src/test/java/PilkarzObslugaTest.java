package test.java;

import static org.junit.Assert.*;
import java.util.List;

import org.junit.Test;

import main.java.com.kstelmach.jdbc.domain.Pilkarz;
import main.java.com.kstelmach.jdbc.service.PilkarzObsluga;


public class PilkarzObslugaTest {
	
	
	PilkarzObsluga pilkarzObsluga = new PilkarzObsluga();

	private final static int ID_KLUBU = 1;
	private final static String IMIE = "TOMEK";
	private final static String NAZWISKO = "NOWAK";
	private final static String POZYCJA = "BRAMKARZ";
	
	
	private final static int ZMIANA_ID_KLUBU = 1;
	private final static String ZMIANA_IMIE = "Artur";
	private final static String ZMIANA_NAZWISKO = "Kowalski";
	private final static String ZMIANA_POZYCJA = "obronca";
	
	
	@Test
	public void checkConnection(){
		assertNotNull(pilkarzObsluga.getConnection());
	}
	
	@Test
	public void sprawdzDodawanie(){
		
		Pilkarz pilkarz = new Pilkarz( ID_KLUBU, IMIE, NAZWISKO,POZYCJA);
		
		pilkarzObsluga.wyczyscPilkarzy();
		assertEquals(1,pilkarzObsluga.dodajPilkarza(pilkarz));
		
		List<Pilkarz> pilkarze = pilkarzObsluga.pokazWszystkichPilkarzy();
		Pilkarz pilkarzRetrieved = pilkarze.get(0);
		

		assertEquals(ID_KLUBU, pilkarzRetrieved.getIdKlubu());
		assertEquals(IMIE, pilkarzRetrieved.getImie());
		assertEquals(NAZWISKO, pilkarzRetrieved.getNazwisko());
		assertEquals(POZYCJA, pilkarzRetrieved.getPozycja());
		
	}
	
	@Test
	public void usuwanieJednego()	
	{
		Pilkarz pilkarz = new Pilkarz (ID_KLUBU, IMIE, NAZWISKO,POZYCJA);
		pilkarzObsluga.wyczyscPilkarzy();
		assertEquals(1,pilkarzObsluga.dodajPilkarza(pilkarz));
		List<Pilkarz> pilkarze = pilkarzObsluga.pokazWszystkichPilkarzy();
		Pilkarz pilkarzRetrieved = pilkarze.get(0);
		assertEquals(1, pilkarzObsluga.usunJednegoPilkarza(pilkarzRetrieved));

	}
	
	@Test 
	public 	void zmienDane()
	{
		Pilkarz pilkarz = new Pilkarz (ID_KLUBU, IMIE, NAZWISKO,POZYCJA);
		pilkarzObsluga.wyczyscPilkarzy();
		assertEquals(1,pilkarzObsluga.dodajPilkarza(pilkarz));
		
		List<Pilkarz> pilkarze = pilkarzObsluga.pokazWszystkichPilkarzy();
		Pilkarz pilkarzRetrieved = pilkarze.get(0);
		
		pilkarzRetrieved.setImie(ZMIANA_IMIE);
		pilkarzRetrieved.setNazwisko(ZMIANA_NAZWISKO);
		pilkarzRetrieved.setPozycja(ZMIANA_POZYCJA);
		
		assertEquals(3, pilkarzObsluga.zmienDanePilkarza(pilkarzRetrieved));
		
		List<Pilkarz> pilkarze2 = pilkarzObsluga.pokazWszystkichPilkarzy();
		Pilkarz pilkarzRetrieved2 = pilkarze2.get(0);

		assertEquals(IMIE, pilkarzRetrieved2.getImie());
		assertEquals(NAZWISKO, pilkarzRetrieved2.getNazwisko());
		assertEquals(POZYCJA, pilkarzRetrieved2.getPozycja());
		
	}

}


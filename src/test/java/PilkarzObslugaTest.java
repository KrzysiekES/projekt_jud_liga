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
	    public void szukajPilkarzaWKlubie()
	    {
			Pilkarz pilkarz = new Pilkarz (ID_KLUBU, IMIE, NAZWISKO,POZYCJA);
			pilkarzObsluga.wyczyscPilkarzy();
			Pilkarz pilkarzRetrieved = null;
			assertEquals(1,pilkarzObsluga.dodajPilkarza(pilkarz));
			
			pilkarz = pilkarzObsluga.pokazWszystkichPilkarzy().get(0);
			pilkarzRetrieved = pilkarzObsluga.pokazPilkarzyPoIdKlubu(pilkarz);
			

	        assertEquals(pilkarz.getId(), pilkarzRetrieved.getId());
	        assertEquals(pilkarz.getImie(), pilkarzRetrieved.getImie());
	        assertEquals(pilkarz.getNazwisko(), pilkarzRetrieved.getNazwisko());
	        assertEquals(pilkarz.getPozycja(), pilkarzRetrieved.getPozycja());
	    }

}


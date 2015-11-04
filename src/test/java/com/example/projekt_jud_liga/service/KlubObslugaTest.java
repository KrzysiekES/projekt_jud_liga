package test.java.com.example.projekt_jud_liga.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import main.com.example.projekt_jud_liga.domain.Klub;
import main.com.example.projekt_jud_liga.service.KlubObsluga;
public class KlubObslugaTest {
	
	KlubObsluga klubObsluga = new KlubObsluga();
	
	private final static String NAZWA = "Lechia";
	private final static String BARWY = "Bialo-Zielone";
	
	@Test
	public void checkConnection(){
		assertNotNull(klubObsluga.getConnection());
	}
	
	@Test
	public void sprawdzDodawanie(){
		
		Klub klub = new Klub( NAZWA, BARWY);
		
		klubObsluga.wyczyscKluby();
		assertEquals(1,klubObsluga.dodajKlub(klub));
		
		List<Klub> kluby = klubObsluga.pokazWszystkieKluby();
		Klub klubRetrieved = kluby.get(0);
		
		assertEquals(NAZWA, klubRetrieved.getNazwa());
		assertEquals(BARWY, klubRetrieved.getBarwy());
		
	}
	
    @Test
    public void sprawdzOdswiezanieDanych()
    {
    	
    	Klub klub = new Klub (NAZWA, BARWY);
    	klubObsluga.wyczyscKluby();
    	assertEquals(1,klubObsluga.dodajKlub(klub));
    	
		List<Klub> kluby = klubObsluga.pokazWszystkieKluby();
		Klub klubRetrieved = kluby.get(0);

		klubRetrieved.setNazwa("Bayern");
		klubRetrieved.setBarwy("czarne");

		
		assertEquals(1, klubObsluga.odswiezDane(klub));
		
		List<Klub> kluby2 = klubObsluga.pokazWszystkieKluby();
		Klub klubRetrieved2 = kluby2.get(0);


		
		assertEquals("Bayern", klubRetrieved2.getNazwa());
		assertEquals("czarne", klubRetrieved2.getBarwy()); 
    }

}


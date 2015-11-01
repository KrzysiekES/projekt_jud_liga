package com.example.projekt_jud_liga.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.example.projekt_jud_liga.domain.Klub;

public class KlubObslugaTest {
	
	
	KlubObsluga klubObsluga = new KlubObsluga();
	private final static String NAZWA = "Lechia";
	private final static int ROK_ZALOZENIA = 1922;
	private final static String BARWY = "Bialo-Zielone";
	
	@Test
	public void checkConnection(){
		assertNotNull(klubObsluga.getConnection());
	}
	
	@Test
	public void sprawdzDodawanie(){
		
		Klub klub = new Klub(NAZWA, ROK_ZALOZENIA, BARWY);
		
		klubObsluga.wyczyscKluby();
		assertEquals(1,klubObsluga.dodajKlub(klub));
		
		List<Klub> kluby = klubObsluga.pokazWszystkieKluby();
		Klub klubRetrieved = klub.get(0);
		
		assertEquals(NAZWA, klubRetrieved.getNazwa());
		assertEquals(ROK_ZALOZENIA, klubRetrieved.getRokZalozenia());
		assertEquals(BARWY, pilkarzRetrieved.getBarwy());
		
	}

}


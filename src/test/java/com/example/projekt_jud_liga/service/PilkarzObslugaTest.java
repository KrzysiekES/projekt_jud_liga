package com.example.jdbcdemo.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.example.projekt_jud_liga.domain.Pilkarz;

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
		
		Pilkarz pilkarz = new Pilkarz(ID_KLUBU, IMIE, NAZWISKO);
		
		pilkarzObsluga.wyczyscPilkarzy();
		assertEquals(1,pilkarzObsluga.dodajPilkarza(pilkarz));
		
		List<Pilkarz> pilkarze = pilkarzObsluga.pokazWszystkichPilkarzy();
		Pilkarz pilkarzRetrieved = pilkarz.get(0);
		
		assertEquals(ID_KLUBU, pilkarzRetrieved.getIdKlubu());
		assertEquals(IMIE, pilkarzRetrieved.getImie());
		assertEquals(NAZWISKO, pilkarzRetrieved.getNazwisko());
		assertEquals(POZYCJA, pilkarzRetrieved.getPozycja());
		
	}

}


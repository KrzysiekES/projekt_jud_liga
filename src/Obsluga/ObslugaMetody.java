package Obsluga;

import java.util.InputMismatchException;
import java.util.Scanner;

import LigaPilkarska.Klub;
import LigaPilkarska.Pilkarz;

public class ObslugaMetody {
	Obsluga obsluga = new Obsluga();
	Scanner wpr = new Scanner(System.in);
	
	public void Menu() {// MENU
		System.out.println("1.Wyswietl wszystkich pilkarzy");
		System.out.println("2.Dodaj pilkarza");
		System.out.println("3.Usuñ Pilkarza");
		System.out.println("4.Wyœwietl wszystkie Kluby");
		System.out.println("5.Dodaj klub");
		System.out.println("6.Usuñ Klub");
		System.out.println("7.");
		System.out.println("8.");
		System.out.println("9.");
		System.out.println("0.Wyjscie");
		System.out.print("Wybierz : . . .");
	}
	
	public void WyswietlPilkarzy() {
		System.out.println("Pilkarze : ");
		for (int i = 0; i < obsluga.Pilkarze.size(); i++) {
			obsluga.Pilkarze.get(i).PilkarzInfo();
		}
	}
	
	public void DodaniePilkarza() {
		try{
			int idKlubu;
			String imie;
			String nazwisko;
			String pozycja;	
			System.out.println("Podaj id Klubu: ");
				idKlubu = wpr.nextInt();
			System.out.println("Podaj imiê pilkarza: ");
				imie = wpr.next();
			System.out.println("Podaj nazwisko");
				nazwisko = wpr.next();
			System.out.println("Podaj pozycje");
				pozycja = wpr.next();
			// Wprowadzanie pilkarza
			obsluga.Pilkarze.add(new Pilkarz(obsluga.idPilk, idKlubu, imie, nazwisko, pozycja));
			obsluga.liczbaPilkarzy++;
			obsluga.idPilk++;
		}catch(InputMismatchException ex) {
            System.err.println("Zle podana wartosc");
        }
	}
	public void UsunPilkarza() {
		int sprawdzanie; 
		System.out.println("Podaj id Pilkarza,ktorego chcesz usunac : ");
		sprawdzanie = wpr.nextInt();
		// jesli podany jest poprawny nr id pilkarza,to zostaje on usuniety
		obsluga.Pilkarze.remove(sprawdzanie - 1);
		obsluga.liczbaPilkarzy--;
	}
	
	public void WyswietlKluby() {
		System.out.println("Kluby : ");
		for (int i = 0; i < obsluga.Kluby.size(); i++) {
			obsluga.Kluby.get(i).KlubInfo();
		}
	}
	
	public void DodanieKlubu() {
		try{
			String nazwa;
			int rokZalozenia;
			String barwy;	
			System.out.println("Podaj nazwe Klubu: ");
				nazwa = wpr.next();
			System.out.println("Podaj rok zalozenia: ");
				rokZalozenia = wpr.nextInt();
			System.out.println("Podaj barwy: ");
				barwy = wpr.next();

			// Wprowadzanie klubu
			obsluga.Kluby.add(new Klub(obsluga.idKlub, nazwa, rokZalozenia, barwy));
			obsluga.liczbaKlubow++; 
			obsluga.idPilk++; 
		}catch(InputMismatchException ex) {
            System.err.println("Zle podana wartosc");
        }
	}
	public void UsunKlub() {
		int sprawdzanie; 
		System.out.println("Podaj id Klubu,ktory chcesz usunac : ");
		sprawdzanie = wpr.nextInt();
		// jesli podany jest poprawny nr id pilkarza,to zostaje on usuniety
		obsluga.Kluby.remove(sprawdzanie - 1);
		obsluga.liczbaKlubow--;
	}
	
	
}

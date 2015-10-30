package Obsluga;

import java.util.InputMismatchException;
import java.util.Scanner;

import LigaPilkarska.Pilkarz;

public class ObslugaMetody {
	Obsluga obsluga = new Obsluga();
	Scanner wpr = new Scanner(System.in);
	
	public void Menu() {// MENU
		System.out.println("1.Wyswietl wszystkich pilkarzy");
		System.out.println("2.Dodaj pilkarza");
		System.out.println("3.");
		System.out.println("4.");
		System.out.println("5.");
		System.out.println("6.");
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
			// Wprowadzanie pilkarza do Bazy Pracownikow
			obsluga.Pilkarze.add(new Pilkarz(obsluga.idPilk, idKlubu, imie, nazwisko, pozycja));
			obsluga.liczbaPilkarzy++; // Zwiekszenie liczby pracownikow
			obsluga.idPilk++; // Zwiekszenie id pracownika	
		}catch(InputMismatchException ex) {
            System.err.println("Zle podana wartosc");
        }
	}
	public void Usun() {
		int sprawdzanie; 
		System.out.println("Podaj id Pilkarza,ktorego chcesz usunac : ");
		sprawdzanie = wpr.nextInt();
		// jesli podany jest poprawny nr id pilkarza,to zostaje on usuniety
		obsluga.Pilkarze.remove(sprawdzanie - 1);
		obsluga.liczbaPilkarzy--;
	}
	
	
}

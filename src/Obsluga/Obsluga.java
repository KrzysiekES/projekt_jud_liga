package Obsluga;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import LigaPilkarska.Pilkarz;
public class Obsluga {
	

	int wybor;		//Zmienna do Scannera
	Scanner wprowadz = new Scanner(System.in);
	int koniec = 1;// zmienna do zamykania programu
	int liczbaPilkarzy =0;
	int idPilk =1;
	ArrayList<Pilkarz> Pilkarze = new ArrayList<Pilkarz>();
	public static void main(String[] args) {
		
		Obsluga obsluga = new Obsluga(); // Klasa do pobrania zmiennych
		ObslugaMetody obslugaMetody = new ObslugaMetody(); 
	
		//nieskonczona petla menu
		while (obsluga.koniec != 0) {
		
			obslugaMetody.Menu();
			
			//Wybranie wartoœci w menu
			try{		
				obsluga.wybor = obsluga.wprowadz.nextInt();
			}catch(InputMismatchException ex) {
				System.err.println("Podana wartoœæ nie jest liczb¹ ");
			}
			//Menu 
			switch(obsluga.wybor){
				case 1: { //Wyœwietlanie Pilkarzy
					obslugaMetody.WyswietlPilkarzy();
					break;
				}
				case 2: {
					obslugaMetody.DodaniePilkarza();
				}
				case 3: {
				
				
				}
				case 4: {
				
				}
			}
		}
	}
}
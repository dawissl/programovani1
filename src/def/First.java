package def;
import java.util.*;

import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil.ToStringAdapter;

import java.lang.Math;
import static java.lang.Math.*;

class First {
	private static Random random = new Random();
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		//A: Nacist od uzivatele udaje o dvou studentech
		//	 (jmeno, prijmeni, hodina, minuta)
		//I: udaje od uzivatele
		//O: promenne naplnene hodnotami
		System.out.println("Zadej krestni jmeno prvniho:");
		String firstName1 = input.next();
		System.out.println("Zadej prijmeni prvniho:");
		String surname1 = input.next();
		System.out.println("Zadej hodinu prvniho:");
		int hour1 = input.nextInt();
		System.out.println("Zadej minutu prvniho:");
		int minute1 = input.nextInt();
		
		System.out.println("Zadej krestni jmeno druheho:");
		String firstName2 = input.next();
		System.out.println("Zadej prijmeni druheho:");
		String surname2 = input.next();
		System.out.println("Zadej hodinu druheho:");
		int hour2 = input.nextInt();
		System.out.println("Zadej minutu druheho:");
		int minute2 = input.nextInt();

		//A: Zjistit, ktery student odevzdal pozdeji
		//I: Promenne z predchoziho algoritmu
		//O: Promenne s vysledkem (udaji studenta)

		String firstName, surname; //O:
		int hour, minute; //O:
		
		//A: vypocet minut od zacatku dne
		//I: pocet minut a hodin od pocatku dne
		//O: pocet minut od zacatku dne
		
		int timeInMinutes1 = timeInMinutes(hour1,minute1); 
		int timeInMinutes2 = timeInMinutes(hour2,minute2); 
		
		if (timeInMinutes1>timeInMinutes2) {
			firstName = firstName1;
			surname = surname1;
			hour = hour1;
			minute = minute1;
		} else {
			firstName = firstName2;
			surname = surname2;
			hour = hour2;
			minute = minute2;
		}

		//A: vypis studenta
		//I: promenne s udaji o studentovi
		//O: vypis v konzoli


		printStudent(firstName, surname, hour, minute);

	}
	/**
	 * Get sum of minutes from begin of the day
	 * @param hour number of hours
	 * @param minute number of minutes
	 * @return sum of hours and minutes
	 */
	static int timeInMinutes(int hour,int minute) {
		return hour * 60 + minute;
	}
	
	/**
	 * Print student to console
	 * @param firstName 
	 * @param surName
	 * @param hour
	 * @param minute
	 */
	static void printStudent(String firstName,String surName, int hour, int minute ) {
		String out = "Jmeno: " + firstName +
				"\nPrijmeni: " + surName +
				"\nCas: " + hour + ":" + minute;
		System.out.println(out);
	}
}

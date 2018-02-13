import java.util.*;
import java.lang.Math;
import static java.lang.Math.*;

class First {
	private static Random random = new Random();
	private static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		//nacteni udaju o dvou studentech - jmeno, prijmeni, hodina, minuta

		System.out.println("Input first student>");
		String firstName1 = input.next();
		String sureName1=input.next();
		int hour1=input.nextInt();
		int minute1=input.nextInt();
		System.out.println("Input second student>");
		String firstName2 = input.next();
		String sureName2=input.next();
		int hour2=input.nextInt();
		int minute2=input.nextInt();

		//System.out.println(firstName1+" "+sureName1+" "+hour1+":"+minute1);
		//System.out.println(firstName2+" "+sureName2+" "+hour2+":"+minute2);
		
		//algoritmus: zjisti, ktery student odevzdal pozdeji
		String firstName,sureName;
		int hour,minute;
		if(hour1!=hour2) {
			if(hour1>hour2) {
				firstName=firstName1;
				sureName=sureName1;
				hour=hour1;
				minute=minute1;						
			}else {
				firstName=firstName2;
				sureName=sureName2;
				hour=hour2;
				minute=minute2;
			}
		}else {
			if(minute1>minute2) {
				firstName=firstName1;
				sureName=sureName1;
				hour=hour1;
				minute=minute1;
			}else {
				firstName=firstName2;
				sureName=sureName2;
				hour=hour2;
				minute=minute2;
			}
		}
		
		System.out.println("Pozdeji odevzdal: "+firstName+" "+sureName+" v èase "+hour+":"+minute);
	}
}

package def;

public class Student {

	private String firstName;
	private String surName;
	private int minute;
	private int hour;
	
	public Student(String firstName, String surName, int minute, int hour) {
		this.firstName = firstName;
		this.surName = surName;
		this.minute = minute;
		this.hour = hour;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}
	
	public int timeInMinutes() {
		return this.hour * 60 + this.minute;
	}

	@Override
	public String toString() {
		return "Jmeno: " + firstName +
				"\nPrijmeni: " + surName +
				"\nCas: " + hour + ":" + minute;
	}
	
	
	
	
}

package javaProject_extendsTest;

public class HomeworkTest {
	
	public static void main(String[] args) {
		
		Person[] team = new Person[3];
		
		Person nhj = new NaHoJin();
		Person ksb = new KangSeungBae();
		
		team[0] = nhj;
		team[1] = ksb;
		
		for(Person person : team) {
			Person person2 = person;
			if(person2 instanceof NaHoJin) {
				NaHoJin nahojin = (NaHoJin)person2;
				nahojin.sleeping();
			} else if(person2 instanceof KangSeungBae) {
				KangSeungBae kangseungbae = (KangSeungBae)person2;
				kangseungbae.eating();
			}
		}
	}
}

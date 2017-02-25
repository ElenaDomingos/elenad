package ru.job4j;


public class Doctor extends Professions{

public static void main(String[] args) {
	
	Doctor who = new Doctor();
	
	who.work(20);
	
	who.getSalaryAfterTaxesWasPaid(1000, 100);		
}


}
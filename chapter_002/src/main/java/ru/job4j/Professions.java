package ru.job4j;

/**
 *Class Professions
 *@autor Elena Domingos
 *@since 02.25.2016
 */

public class Professions {

	String name;

	boolean education;

	int experienceyears;

	int hoursperday;

	int salary;

	int taxespaid;


	public void work(int hoursperday) {

		for(int i = 0;i < hoursperday; i++) {

			System.out.println("Is working");

		}

	}

	public void getSalaryAfterTaxesWasPaid(int salary, int taxespaid){

		int lucro = salary - taxespaid;
		System.out.print(lucro);

	}

}
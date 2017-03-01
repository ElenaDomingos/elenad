package ru.job4j;


public class Doctor extends Professions{

public static void main(String[] args) {

Doctor who = new Doctor();
	
Teacher ofmath = new Teacher();



who.attend(ofmath);

}

public static void attend( Teacher teacher) {
	
	
	
	System.out.print("Doctor  attends teacher" );
	
	
}


}
package ru.job4j;

/**
*Class Factorial
*@autor Elena Domingos
*@since 12.20.2016
*/

public class Factorial {
	
/**
*Main.
*@param int a, int b.
*/

	
	public int factorial(int a, int b) {
		
		 for (int i=1; i<=b; i++){
              a=a*i;
        }
		return a;
	}
	

}


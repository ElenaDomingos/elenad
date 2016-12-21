package ru.job4j;

public class Max {
	



		public int max(int first, int second) {

		
		int max = 0;		
		(first > second) ? max = first : max = second;
		return max;
		
	}
	
	public int max(int first, int second, int third) {
		
		(third > max.max()) ? max = third : max = max;
		return max;
		
	}
	
	
	
	
}

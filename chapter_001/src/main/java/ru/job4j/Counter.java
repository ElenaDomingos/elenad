package ru.job4j;

public class Counter {
	
	public int add(int start, int finish) {
		
		for (start = 0; start < finish; start++) {
			if(start %2 ==0) {
				start = start + start;
				continue;
			}
			else {
				continue;
			}
		}
		return start;
	}
	
	
	
	
}
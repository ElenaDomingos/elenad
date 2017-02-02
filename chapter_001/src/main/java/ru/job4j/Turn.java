package ru.job4j;

public class Turn {
	public static void main(String[] args){
	int[] values = new int[5];
	values[0] =1;
	values[1] =13;
	values[2] =5;
	values[3] =6;
	values[4] =6;
	
	     
        back(values);
       for(int i =0; i<values.length; i++) {
            System.out.println(values[i]);
       }
       

	}

    public static int back(int[] values) {

	    int[] arr = new int[5];
        for(int index = 0; index<values.length; index++) {
			
			
			arr[index] = values[values.length-index-1] ;
		}
        
		for(int i=0; i<values.length;i++){
			values[i] = arr[i];
		}
    
				
	      
     return 0;
     }

}
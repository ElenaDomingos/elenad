package ru.job4j;


/**
*Class SortArray
*@autor Elena Domingos
*@since 02.16.2016
*/

public class SortArray {
	
/**
*Main.
*@param args - args.
*/
public static void main(String[] args) {
	

int[] Sortornot = new int[5];	
Sortornot[0]=1;
Sortornot[1]=2;
Sortornot[2]=7;
Sortornot[3]=4;
Sortornot[4]=5;

IfSort(Sortornot);

	
}


	
public static void IfSort(int[] arr) {
    
    boolean allsort = false;
	
	for(int i=0; i < arr.length-1;i++){
		
		if (arr[i] < arr[i+1]) {
			
			allsort = true;
			
           }
            
            else {
                allsort = false;
				System.out.print("Is not sort array");
                break;
				
                
                 
        }
	
	}
    
    if(allsort == true){
        System.out.print("All sort");
    }
    
    
}

}
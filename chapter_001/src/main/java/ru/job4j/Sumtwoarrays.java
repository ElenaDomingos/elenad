package ru.job4j;


/**
*Class Sumtwoarrays
*@autor Elena Domingos
*@since 02.18.2016
*/

public class Sumtwoarrays {
	
/**
*Main.
*@param args - args.
*/
public static void main(String[] args) {
	

int[] Sortarray1 = new int[5];	
Sortarray1[0]=1;
Sortarray1[1]=2;
Sortarray1[2]=3;
Sortarray1[3]=4;
Sortarray1[4]=5;

int[] Sortarray2 = new int[5];	
Sortarray2[0]=6;
Sortarray2[1]=7;
Sortarray2[2]=8;
Sortarray2[3]=9;
Sortarray2[4]=17;

sumarrays(Sortarray1, Sortarray2);

}


public static void sumarrays(int[] arr1, int[] arr2) {
	
	int[] arr = new int[10];
	int x = 0;
	int i = 0;
	while(i < arr1.length) {
		
		
		if(arr2[i] > arr1[i]) {
			arr[i+x] = arr1[i];
			arr[i+1+x] = arr2[i];
			i++;x++;
		}
		else {
			
			arr[i+x] = arr2[i];
			arr[i+1+x] = arr1[i];
			i++;x++;
			
		}
		
	}
		
		for (int y = arr.length - 1; y > 0; y--) {
            for (int j = 0; j < y; j++) {

                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }

	   
	}
	
	
	
    for(int j=0;j<arr.length;j++){
		System.out.println(arr[j]);	
		
	}
	
}

}
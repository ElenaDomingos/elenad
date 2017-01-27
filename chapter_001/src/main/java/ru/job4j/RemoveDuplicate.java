package ru.job4j;
/**
 * Created by Helena on 14/01/2017.
 */
public class RemoveDuplicate {
	public static void main(String[] args){
		
		String arr[] = new String[] {"Liza", "Olga", "Liza", "Sveta","Valeria"};
		
		RemoveDuplicate newarr = new RemoveDuplicate();
		newarr.removeDuplicates(arr);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
	}

    public static void removeDuplicates(String[] list) {
        for (int i = 0; i < list.length; i++)
        {
            String a = list[i];
            for(int j = 0; j< list.length; )

                if (a.equals(list[j]))
                {
                    list[j] = null;
                    list[j] = list[list.length - j]; }
                else {
                    j++;

                }
        }
    }


}
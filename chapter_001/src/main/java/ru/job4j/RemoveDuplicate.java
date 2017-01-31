package ru.job4j;
/**
 * Created by Helena on 14/01/2017.
 */
public class RemoveDuplicate {

    public static void main(String[] args){


        String[] arr =  {"Liza", "Olga", "Liza", "Sveta", "Valeria"};

       removeDuplicates(arr);

        for(int i=0; i < arr.length ; i++) {
           System.out.println(arr[i]);
        }


    }

    public static void removeDuplicates(String[] arr) {


        for (int i = 0; i <arr.length; i++)
        {
            String a = arr[i];
            for(int j = 0; j < arr.length; )

            {
                if (a.equals(arr[j])) {
                    
                     arr[j]= null;
                    arr[j] = arr[arr.length-1];
					j++;

                } else {
                    j++;

                }
            }

        }
    }


}
package ru.job4j;

/**
 * Created by Helena on 14/01/2017.
 */
public class Duplicate {

   // public static void main(String[] args)  {

     //   String[] list = {"Maria", "Natalya", "Maria", "Sasha", "Sveta", "Olga"};
     //   removeDuplicates(list);


   // }
   
   
    public static void removeDuplicates(String[] list) {

        for (int i = 0; i < list.length; i++) {

           String a = list[i];

            for(int j = 0; j< list.length; )
                if (a == list[j]) {
                    list[j] = null;
                } else {

                    j++;
                }

        }

            for (int i = 0; i < list.length; i++)
        {
           
            System.out.println( list[i] );
        }

    }
}

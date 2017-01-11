package ru.job4j;

public class Booble {

   

    public int[]  booble(int[] values) {

        for (int i = values.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (values[j] > values[j + 1]) {
                    int tmp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = tmp;
                }
            }


        }
        return 0;
    }

}
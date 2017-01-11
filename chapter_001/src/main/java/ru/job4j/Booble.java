package ru.job4j;

public class Booble {

    public static void main(String[] args) {


        int values[] = {1, 2, 5, 87, 7};

        Booble var = new Booble();
        for (int i = 0; i < values.length; i++)
        {
            int x = var.booble(values);
            System.out.println(values[i]);
        }

    }

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
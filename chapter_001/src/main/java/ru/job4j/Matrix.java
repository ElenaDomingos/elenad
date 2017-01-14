package ru.job4j;

/**
 * Created by Helena on 08/01/2017.
 */
public class Matrix {


    public int[][] rotated (int[][] values) {
        int[][] Matrix = new int[values.length][values.length];

        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values.length; j++) {
                Matrix[i][j] = values[values.length - j - 1][i];
            }
        }
        return Matrix;
    }
}



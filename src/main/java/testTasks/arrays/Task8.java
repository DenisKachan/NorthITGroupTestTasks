package testTasks.arrays;

import lombok.extern.log4j.Log4j2;

import java.util.Random;

@Log4j2
public class Task8 {

    public static void main(String[] args) {
        int[][] array = new int[5][5];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        int[] arrayOfSumColumns = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[j][i];
            }
            arrayOfSumColumns[i] = sum;
        }
        int maxSum = arrayOfSumColumns[0];
        for (int arrayOfSumColumn : arrayOfSumColumns) {
            if (maxSum < arrayOfSumColumn) {
                maxSum = arrayOfSumColumn;
            }
        }
        log.info("The biggest sum of the columns is " + maxSum);
    }
}

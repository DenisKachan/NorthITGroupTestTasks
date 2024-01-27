package testTasks.arrays;

import lombok.extern.log4j.Log4j2;

import java.util.Random;

@Log4j2
public class Task7 {

    public static void main(String[] args) {
        int[][] array = new int[10][10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10);
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((i + j) == (array.length - 1)) {
                    log.info(array[i][j]);
                }
            }
        }
    }
}

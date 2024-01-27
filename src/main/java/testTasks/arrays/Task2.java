package testTasks.arrays;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;

@Log4j2
public class Task2 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            log.info("Enter the length of the array of numbers");
            int lengthOfTheArray = scanner.nextInt();
            int[] arrayOfNumbers = new int[lengthOfTheArray];
            int sumOfNumbersWithEvenIndexes = 0;
            for (int i = 0; i < lengthOfTheArray; i++) {
                log.info("Enter the number to add it into the array");
                arrayOfNumbers[i] = scanner.nextInt();
                if (i % 2 == 0) {
                    if (i == 0) {
                        continue;
                    }
                    sumOfNumbersWithEvenIndexes += arrayOfNumbers[i];
                }
            }
            log.info("Sum of numbers from the array with even indexes is " + sumOfNumbersWithEvenIndexes);
        }
    }
}

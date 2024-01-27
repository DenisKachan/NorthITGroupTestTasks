package testTasks.arrays;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;

@Log4j2
public class Task4 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            log.info("Enter the length of the array of numbers");
            int lengthOfTheArray = scanner.nextInt();
            int[] arrayOfNumbers = new int[lengthOfTheArray];
            for (int i = 0; i < lengthOfTheArray; i++) {
                log.info("Enter the number to add it into the array");
                arrayOfNumbers[i] = scanner.nextInt();
            }
            boolean isSorted = false;
            while (!isSorted) {
                isSorted = true;
                for (int i = 0; i < arrayOfNumbers.length - 1; i++) {
                    if (arrayOfNumbers[i] > arrayOfNumbers[i + 1]) {
                        int temp = arrayOfNumbers[i];
                        arrayOfNumbers[i] = arrayOfNumbers[i + 1];
                        arrayOfNumbers[i + 1] = temp;
                        isSorted = false;
                    }
                }
            }
            log.info("The largest number from the array of numbers is " + arrayOfNumbers[lengthOfTheArray - 1]);
        }
    }
}

package testTasks.arrays;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;

@Log4j2
public class Task1 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            log.info("Enter the length of the array of numbers");
            int lengthOfTheArray = scanner.nextInt();
            int[] arrayOfNumbers = new int[lengthOfTheArray];
            int positiveNumbersCounter = 0;
            int negativeNumbersCounter = 0;
            int equalsZeroCounter = 0;
            for (int i = 0; i < lengthOfTheArray; i++) {
                log.info("Enter the number to add it into the array");
                arrayOfNumbers[i] = scanner.nextInt();
                if (arrayOfNumbers[i] < 0) {
                    negativeNumbersCounter++;
                } else if (arrayOfNumbers[i] == 0) {
                    equalsZeroCounter++;
                } else {
                    positiveNumbersCounter++;
                }
            }
            log.info("The total amount of positive numbers is " + positiveNumbersCounter);
            log.info("The total amount of negative numbers is " + negativeNumbersCounter);
            log.info("The total amount of zeros is " + equalsZeroCounter);
        }
    }
}

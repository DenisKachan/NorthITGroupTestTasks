package testTasks.arrays;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;

@Log4j2
public class Task5 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            log.info("Enter the length of the array of numbers");
            int lengthOfTheArray = scanner.nextInt();
            int[] arrayOfNumbers = new int[lengthOfTheArray];
            for (int i = 0; i < lengthOfTheArray; i++) {
                log.info("Enter the number to add it into the array");
                arrayOfNumbers[i] = scanner.nextInt();
            }
            int tempcount = 0;
            int temp = 0;
            int[] frequencyNumber = new int[arrayOfNumbers.length];
            for (int i = 0; i < arrayOfNumbers.length; i++) {
                temp = arrayOfNumbers[i];
                tempcount = 0;
                for (int arrayOfNumber : arrayOfNumbers) {
                    if (temp == arrayOfNumber)
                        tempcount++;
                }
                frequencyNumber[i] = tempcount;
            }
            int maxIndex = 0;
            for (int i = 0; i < frequencyNumber.length; i++) {
                if (frequencyNumber[i] >= frequencyNumber[maxIndex] && arrayOfNumbers[i] > arrayOfNumbers[maxIndex]) {
                    maxIndex = i;
                }
            }
            if (tempcount == 1) {
                log.info("All the numbers from the array of numbers are unique");
            } else {
                log.info("The biggest most frequent number is " + arrayOfNumbers[maxIndex]);
            }
        }
    }
}

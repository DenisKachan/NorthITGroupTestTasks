package testTasks.arrays;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;

@Log4j2
public class Task3 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){
            log.info("Enter the length of the array of numbers");
            int lengthOfTheArray = scanner.nextInt();
            int[] arrayOfNumbers = new int[lengthOfTheArray];
            int sumOfEvenNumbers = 0;
            for (int i = 0; i < lengthOfTheArray; i++) {
                log.info("Enter the number to add it into the array");
                arrayOfNumbers[i] = scanner.nextInt();
                if (arrayOfNumbers[i] % 2 == 0) {
                    sumOfEvenNumbers += arrayOfNumbers[i];
                }
            }
            log.info("Sum of even numbers from the array is " + sumOfEvenNumbers);
        }
    }
}

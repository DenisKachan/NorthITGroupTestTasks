package testTasks.conditions;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;

@Log4j2
public class Task4 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int positiveNumbersCounter = 0;
            int negativeNumbersCounter = 0;
            int equalsZeroCounter = 0;
            int amountOfInputs = 0;
            while (amountOfInputs < 4) {
                log.info("Enter the number");
                int number = scanner.nextInt();
                if (number < 0) {
                    negativeNumbersCounter++;
                } else if (number == 0) {
                    equalsZeroCounter++;
                } else {
                    positiveNumbersCounter++;
                }
                amountOfInputs++;
            }
            log.info("The total amount of positive numbers is " + positiveNumbersCounter);
            log.info("The total amount of negative numbers is " + negativeNumbersCounter);
            log.info("The total amount of zeros is " + equalsZeroCounter);
        }
    }
}

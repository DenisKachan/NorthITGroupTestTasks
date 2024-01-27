package testTasks.conditions;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;

@Log4j2
public class Task5 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int maxNumber;
            log.info("Enter the first number");
            int firstNumber = scanner.nextInt();
            log.info("Enter the second number");
            int secondNumber = scanner.nextInt();
            log.info("Enter the third number");
            int thirdNumber = scanner.nextInt();
            if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
                maxNumber = firstNumber;
            } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
                maxNumber = secondNumber;
            } else {
                maxNumber = thirdNumber;
            }
            log.info("The biggest number is " + maxNumber);
        }
    }
}

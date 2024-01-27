package testTasks.conditions;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;

@Log4j2
public class Task2 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){
            log.info("Enter the first number");
            int firstNumber = scanner.nextInt();
            log.info("Enter the second number");
            int secondNumber = scanner.nextInt();
            if (firstNumber>secondNumber){
                log.info("The first number is bigger than the second number");
            } else if (firstNumber==secondNumber) {
                log.info("The numbers are equal");
            } else {log.info("The first number is less than the second");}
        }
    }
}

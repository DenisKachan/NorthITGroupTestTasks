package testTasks.conditions;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;

@Log4j2
public class Task7 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            log.info("Enter the number");
            int number = scanner.nextInt();
            if (number % 2 == 0) {
                log.info("The number is even");
            } else {
                log.info("The number is odd");
            }
        }
    }
}

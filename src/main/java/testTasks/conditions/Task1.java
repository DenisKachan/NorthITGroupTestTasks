package testTasks.conditions;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;

@Log4j2
public class Task1 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            log.info("Enter the number");
            int number = scanner.nextInt();
            if (number > 10) {
                log.info("The number is bigger than 10");
            } else if (number == 10) {
                log.info("The number equals 10");
            } else {
                log.info("The number is less than 10");
            }
        }
    }
}

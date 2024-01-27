package testTasks.loops;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;

@Log4j2
public class Task4 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            log.info("Enter the number");
            int number = scanner.nextInt();
            int neededNumber = 1;
            for (int i = 1; i <= number; i++) {
                neededNumber = neededNumber * i;
            }
            log.info("Factorial of " + number + " is " + neededNumber);
        }
    }
}

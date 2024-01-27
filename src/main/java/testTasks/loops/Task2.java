package testTasks.loops;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;

@Log4j2
public class Task2 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int evenNumber = 0;
            int flag = 0;
            log.info("Enter the number");
            int number = scanner.nextInt();
            if (number >= 0) {
                while (flag < number) {
                    if (evenNumber % 2 == 0) {
                        log.info(evenNumber);
                    }
                    evenNumber++;
                    flag++;
                }
            } else {
                while (flag > number) {
                    if (evenNumber % 2 == 0) {
                        log.info(evenNumber * -1);
                    }
                    evenNumber++;
                    flag--;
                }
            }
        }
    }
}

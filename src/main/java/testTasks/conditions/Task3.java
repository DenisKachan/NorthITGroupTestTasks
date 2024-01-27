package testTasks.conditions;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;

@Log4j2
public class Task3 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            log.info("Enter the first side of a triangle");
            int firstSide = scanner.nextInt();
            log.info("Enter the second side of a triangle");
            int secondSide = scanner.nextInt();
            log.info("Enter the third side of a triangle");
            int thirdSide = scanner.nextInt();
            if (firstSide + secondSide > thirdSide && firstSide + thirdSide > secondSide
                    && secondSide + thirdSide > firstSide) {
                if (firstSide == thirdSide && secondSide == thirdSide) {
                    log.info("The triangle is equilateral");
                } else if (firstSide == secondSide || firstSide == thirdSide || secondSide == thirdSide) {
                    log.info("The triangle is isosceles");
                } else {
                    log.info("The triangle is scalene");
                }
            } else {
                log.info("Such triangle cannot exist");
            }
        }
    }
}

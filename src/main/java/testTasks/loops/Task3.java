package testTasks.loops;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;

@Log4j2
public class Task3 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            log.info("Enter the Fibonacci index");
            int fibonacciIndex = scanner.nextInt();
            int firstFibonacciNumber = 0;
            int secondFibonacciNumber = 1;
            for (int i = 2; i <= fibonacciIndex; ++i) {
                int nextFibonacciNumber = firstFibonacciNumber + secondFibonacciNumber;
                firstFibonacciNumber = secondFibonacciNumber;
                secondFibonacciNumber = nextFibonacciNumber;
            }
            log.info("The Fibonacci number with the index " + fibonacciIndex + " is " + secondFibonacciNumber);
        }
    }
}

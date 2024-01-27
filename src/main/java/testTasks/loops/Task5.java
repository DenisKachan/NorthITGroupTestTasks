package testTasks.loops;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;

@Log4j2
public class Task5 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            log.info("Enter any kind of text");
            String text = scanner.nextLine();
            String neededText = text.replaceAll("[^A-Za-zА-Яа-я]", "");
            for (int i = 0; i < neededText.length(); i++) {
                log.info(neededText.charAt(i));
            }
        }
    }
}

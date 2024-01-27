package testTasks.loops;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Task1 {

    public static void main(String[] args) {
        int flag = 0;
        int number = 1;
        while (flag < 10) {
            log.info("4 x " + number + " = " + (4 * number));
            flag++;
            number++;
        }
    }
}

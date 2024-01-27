package testTasks.conditions;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;

@Log4j2
public class Task8 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int commonItemPrice = 0;
            int firstItemPrice = 50;
            int secondItemPrice = 100;
            int thirdItemPrice = 150;
            log.info("Choose the number of item you want to buy");
            log.info("1. Apple, the price - " + firstItemPrice);
            log.info("2. Cheese, the price - " + secondItemPrice);
            log.info("3. Pork, the price - " + thirdItemPrice);
            int chosenItem = scanner.nextInt();
            commonItemPrice = switch (chosenItem) {
                case (1) -> firstItemPrice;
                case (2) -> secondItemPrice;
                case (3) -> thirdItemPrice;
                default -> commonItemPrice;
            };
            log.info("Enter the amount of money you have");
            int amountOfMoney = scanner.nextInt();
            if (commonItemPrice > amountOfMoney) {
                log.info("You have no enough money to buy this item");
            } else if (commonItemPrice == amountOfMoney) {
                log.info("Thanks for your purchase!");
            } else {
                log.info("Thanks for your purchase! Here is your change - " + (amountOfMoney - commonItemPrice));
            }
        }
    }
}

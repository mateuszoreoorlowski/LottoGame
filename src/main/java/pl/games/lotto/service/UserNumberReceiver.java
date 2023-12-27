package pl.games.lotto.service;

import pl.games.lotto.result.GetUserNumbers;

import java.util.*;

public class UserNumberReceiver implements GetUserNumbers {

    @Override
    public Set<Integer> getUserNumbers() {
        Scanner scanner = new Scanner(System.in);
        int number;
        Set<Integer> userNumbers = new HashSet<>();
        for (int i = 0; i < 6; i++) {
            System.out.println("Please enter 6 numbers between 1 and 99 (inclusive):");
            while (true) {
                try {
                    number = scanner.nextInt();
                    userNumbers.add(number);
                    break;
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("This is not a number. Please try again.");
                } catch (InputMismatchException inputMismatchException) {
                    System.out.println("This is not a number. Please try again.");
                    scanner.nextLine();
                    break;
                }
            }
        }

        return userNumbers;
    }
}

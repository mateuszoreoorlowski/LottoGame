package pl.games.messenger;

import java.util.Set;

public class UserMessenger {

    SpecificMessenger specificMessenger = new SpecificMessenger();
    public void displayUserNumbers(Set<Integer> userNumbers) {
        specificMessenger.displayUserNumbersMessage();
        for (int number : userNumbers) {
            System.out.print(number + " ");
        }
    }

    public void displayWinningNumbers(Set<Integer> lotteryNumbers) {
        specificMessenger.displayWinningNumbersMessage();
        for (int j : lotteryNumbers) {
            System.out.print(j + " ");
        }
    }
}

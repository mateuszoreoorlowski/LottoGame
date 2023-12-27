package pl.games.lotto.result;

import java.util.Set;

public class ResultAnnouncer {

    public void announceResults(Set<Integer> userNumber, Set<Integer> lotteryNumbers) {
        if (userNumber.containsAll(lotteryNumbers))
            System.out.println("Congratulations, you have won!");
        else {
            System.out.println("Sorry, but you didn't win. Try your luck next time. ");
        }
    }

}

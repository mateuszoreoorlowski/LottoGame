package pl.games.lotto.service;

import java.util.HashSet;
import java.util.Set;

public class WinningNumberGenerator {

    public Set<Integer> drawWinningNumbers() {
        Set<Integer> lotteryNumbers = new HashSet<>();
        while (lotteryNumbers.size() < 6) {
            int randomNum = (int) (Math.random() * 99);
            lotteryNumbers.add(randomNum);
        }

        return lotteryNumbers;
    }

//    Set<Integer> drawWinningNumbers() {
//        return new HashSet<>(List.of(1, 2, 3, 4, 5, 6));
//    }
}

package pl.games.lotto;

import pl.games.lotto.result.GameResult;
import pl.games.lotto.result.GetUserNumbers;
import pl.games.lotto.result.ResultAnnouncer;
import pl.games.lotto.result.ValidationResult;
import pl.games.lotto.service.UserNumbersValidator;
import pl.games.lotto.service.WinningNumberGenerator;
import pl.games.messenger.UserMessenger;

import java.util.Set;

public class LottoGame {

    GetUserNumbers getUserNumbers;

    public LottoGame(GetUserNumbers getUserNumbers) {
        this.getUserNumbers = getUserNumbers;
    }

    public GameResult play() {
        Set<Integer> userNumbers = getUserNumbers.getUserNumbers();
        UserNumbersValidator userNumbersValidator = new UserNumbersValidator();
        ValidationResult validationResult = userNumbersValidator.validateNumbers(userNumbers);
        UserMessenger numberDisplayer = new UserMessenger();
        numberDisplayer.displayUserNumbers(userNumbers);

        if(!validationResult.isValid()) {
            return new GameResult("validation error");
        }

        System.out.println();

        WinningNumberGenerator winningNumberGenerator = new WinningNumberGenerator();
        Set<Integer> lotteryNumbers = winningNumberGenerator.drawWinningNumbers();
        numberDisplayer.displayWinningNumbers(lotteryNumbers);

        System.out.println();

        ResultAnnouncer resultAnnouncer = new ResultAnnouncer();
        resultAnnouncer.announceResults(userNumbers, lotteryNumbers);

        return new GameResult("user won");
    }
}

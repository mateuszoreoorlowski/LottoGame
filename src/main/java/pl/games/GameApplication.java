package pl.games;

import pl.games.lotto.result.GetUserNumbers;
import pl.games.lotto.LottoGame;
import pl.games.lotto.service.UserNumberReceiver;


public class GameApplication {
    public static void main(String[] args) {

        GetUserNumbers getUserNumbers = new UserNumberReceiver();
        LottoGame lottoGame = new LottoGame(getUserNumbers);
        lottoGame.play();

    }
}
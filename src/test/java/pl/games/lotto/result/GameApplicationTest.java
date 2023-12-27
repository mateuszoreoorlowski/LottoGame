package pl.games.lotto.result;

import org.junit.jupiter.api.Test;
import pl.games.lotto.LottoGame;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.Set;

public class GameApplicationTest {

    @Test
    public void should_return_user_won_when_user_gave_six_correct_numbers_and_random_generator_generated_same_numbers() {
        // given
        Set<Integer> numbersFromUser = Set.of(1, 2, 3, 4, 5, 6);
        GetUserNumbers getUserNumbers = new GetUserNumbersTestImpl(numbersFromUser);
        LottoGame lottoGame = new LottoGame(getUserNumbers);
        // when
        GameResult gameResult = lottoGame.play();
        // then
        assertThat(gameResult.message).isEqualTo("user won");
    }

    @Test
    public void should_return_validation_error_when_user_gave_atleast_one_number_out_of_range() {
        // given
        Set<Integer> numbersFromUser = Set.of(101, 12, 33, 42, 57, 60);
        GetUserNumbers getUserNumbers = new GetUserNumbersTestImpl(numbersFromUser);
        LottoGame lottoGame = new LottoGame(getUserNumbers);
        // when
        GameResult gameResult = lottoGame.play();
        // then
        assertThat(gameResult.message).isEqualTo("validation error");
    }
}

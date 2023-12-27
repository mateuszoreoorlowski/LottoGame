package pl.games.lotto.result;

import pl.games.lotto.result.GetUserNumbers;

import java.util.Set;

public class GetUserNumbersTestImpl implements GetUserNumbers {

    Set<Integer> numbersFromUser;

    public GetUserNumbersTestImpl(Set<Integer> numbersFromUser) {
        this.numbersFromUser = numbersFromUser;
    }

    @Override
    public Set<Integer> getUserNumbers() {
        return numbersFromUser;
    }
}

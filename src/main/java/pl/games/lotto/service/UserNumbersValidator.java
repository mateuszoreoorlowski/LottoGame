package pl.games.lotto.service;

import pl.games.lotto.result.ValidationResult;

import java.util.Set;

public class UserNumbersValidator {

    public static final int LOWEST_POSSIBLE_NUMBER_FROM_USER = 1;
    public static final int HIGHEST_POSSIBLE_NUMBER_FROM_USER = 99;

    public ValidationResult validateNumbers(Set<Integer> userNumbers) {
        boolean atLeastOneNumberIsOutOfRange = userNumbers.stream()
                .anyMatch(number -> !validateNumberInCorrectRange(number));

        if (atLeastOneNumberIsOutOfRange) {
            return new ValidationResult("number out of range", false);
        }

        return new ValidationResult("not error", true);
    }



    static boolean validateNumberInCorrectRange(int number) {
        return number >= LOWEST_POSSIBLE_NUMBER_FROM_USER && number <= HIGHEST_POSSIBLE_NUMBER_FROM_USER;
    }

}

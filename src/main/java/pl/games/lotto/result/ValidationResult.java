package pl.games.lotto.result;

public class ValidationResult {

    String resultMessage;
    boolean valid;

    public ValidationResult(String resultMessage, boolean valid) {
        this.resultMessage = resultMessage;
        this.valid = valid;
    }

    public boolean isValid(){
        return resultMessage.equals("not error");
    }

}

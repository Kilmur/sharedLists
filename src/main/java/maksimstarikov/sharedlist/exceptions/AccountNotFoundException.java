package maksimstarikov.sharedlist.exceptions;

public class AccountNotFoundException extends RuntimeException {

    private AccountNotFoundException(String message) {
        super(message);
    }

    public static AccountNotFoundException byLogin(String login) {
        return new AccountNotFoundException("Not found by login: " + login);
    }
}

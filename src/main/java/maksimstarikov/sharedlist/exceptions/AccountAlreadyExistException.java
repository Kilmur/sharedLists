package maksimstarikov.sharedlist.exceptions;

public class AccountAlreadyExistException extends RuntimeException {

    private AccountAlreadyExistException(String message) {
        super(message);
    }

    public static AccountAlreadyExistException byLogin(String login) {
        return new AccountAlreadyExistException("Account already exists with login: " + login);
    }
}

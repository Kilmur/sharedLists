package maksimstarikov.sharedlist.exceptions;

import java.util.UUID;

public class AccountListNotFoundException extends RuntimeException {

    private AccountListNotFoundException(String message) {
        super(message);
    }

    public static AccountListNotFoundException byUuid(UUID uuid) {
        return new AccountListNotFoundException("Not found by id: " + uuid);
    }
}

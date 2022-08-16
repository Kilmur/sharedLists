package maksimstarikov.sharedlist.exceptions;

import java.util.UUID;

public class ListItemNotFoundException extends RuntimeException {

    private ListItemNotFoundException(String message) {
        super(message);
    }

    public static ListItemNotFoundException byUuid(UUID uuid) {
        return new ListItemNotFoundException("Not found by id: " + uuid);
    }
}

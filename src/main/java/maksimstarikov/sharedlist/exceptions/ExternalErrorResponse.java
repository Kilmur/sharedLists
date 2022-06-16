package maksimstarikov.sharedlist.exceptions;

import lombok.Value;
import maksimstarikov.sharedlist.exceptions.handlers.ErrorTypes;

@Value(staticConstructor = "create")
public class ExternalErrorResponse {

    ErrorTypes type;

    String message;
}

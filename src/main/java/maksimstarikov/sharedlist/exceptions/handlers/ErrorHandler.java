package maksimstarikov.sharedlist.exceptions.handlers;

import maksimstarikov.sharedlist.exceptions.AccountAlreadyExistException;
import maksimstarikov.sharedlist.exceptions.ExternalErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorHandler {

    @ExceptionHandler({AccountAlreadyExistException.class})
    public ResponseEntity<ExternalErrorResponse> handleAccountAlreadyExist(AccountAlreadyExistException e) {
        return new ResponseEntity<>(ExternalErrorResponse.create(ErrorTypes.ACCOUNT_ALREADY_EXISTS, e.getMessage()), HttpStatus.BAD_REQUEST);
    }
}

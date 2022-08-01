package maksimstarikov.sharedlist.exceptions.handlers;

import maksimstarikov.sharedlist.exceptions.AccountAlreadyExistException;
import maksimstarikov.sharedlist.exceptions.AccountOrPasswordIncorrectException;
import maksimstarikov.sharedlist.exceptions.ExternalErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ErrorHandler {

    @ExceptionHandler({AccountAlreadyExistException.class})
    public ResponseEntity<ExternalErrorResponse> handleAccountAlreadyExist(AccountAlreadyExistException e) {
        return new ResponseEntity<>(ExternalErrorResponse.create(ErrorTypes.ACCOUNT_ALREADY_EXISTS, e.getMessage()), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler({AccountOrPasswordIncorrectException.class})
    public ResponseEntity<ExternalErrorResponse> handleAccountAlreadyExist(AccountOrPasswordIncorrectException e) {
        return new ResponseEntity<>(ExternalErrorResponse.create(ErrorTypes.ACCOUNT_OR_PASSWORD_IS_INCORRECT, e.getMessage()), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler({MethodArgumentNotValidException.class})
    public ResponseEntity<ExternalErrorResponse> handleAccountAlreadyExist(MethodArgumentNotValidException e) {
        FieldError fieldError = e.getBindingResult().getFieldError();
        String errorMessage;
        if (fieldError != null) {
            errorMessage = fieldError.getDefaultMessage() + ": " + fieldError.getField();
        } else {
            errorMessage = "Validation was failed";
        }
        return new ResponseEntity<>(ExternalErrorResponse.create(ErrorTypes.VALIDATION_PROBLEM, errorMessage), HttpStatus.BAD_REQUEST);
    }
}

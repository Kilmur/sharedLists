package maksimstarikov.sharedlist.annotations.handlers;

import maksimstarikov.sharedlist.annotations.Email;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator implements ConstraintValidator<Email, String> {

    @Override
    public boolean isValid(String email, ConstraintValidatorContext constraintValidatorContext) {
        Pattern pattern = Pattern.compile("^([a-zA-Z0-9]+[-._+%]?)+[a-zA-Z0-9]+@([a-zA-Z0-9]+[-.]?)+[a-zA-Z0-9]+.[a-zA-Z]{2,}$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    @Override
    public void initialize(Email constraintAnnotation) {
    }
}

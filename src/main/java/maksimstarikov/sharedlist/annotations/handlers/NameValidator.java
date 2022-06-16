package maksimstarikov.sharedlist.annotations.handlers;

import maksimstarikov.sharedlist.annotations.NameOrNull;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameValidator implements ConstraintValidator<NameOrNull, String> {

    @Override
    public boolean isValid(String name, ConstraintValidatorContext constraintValidatorContext) {
        if (name == null) {
            return true;
        }
        Pattern pattern = Pattern.compile("^([а-яА-Яa-zA-Z]{2,})+$");
        Matcher matcher = pattern.matcher(name);
        return matcher.matches();
    }

    @Override
    public void initialize(NameOrNull constraintAnnotation) {
    }
}

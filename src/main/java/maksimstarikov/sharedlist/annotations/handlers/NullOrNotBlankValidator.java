package maksimstarikov.sharedlist.annotations.handlers;

import maksimstarikov.sharedlist.annotations.NullOrNotBlank;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NullOrNotBlankValidator implements ConstraintValidator<NullOrNotBlank, String> {

    @Override
    public boolean isValid(String field, ConstraintValidatorContext constraintValidatorContext) {
        return field == null || !field.isBlank();
    }

    @Override
    public void initialize(NullOrNotBlank constraintAnnotation) {
    }
}

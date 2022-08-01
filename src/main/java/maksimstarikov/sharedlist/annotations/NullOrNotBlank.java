package maksimstarikov.sharedlist.annotations;

import maksimstarikov.sharedlist.annotations.handlers.NullOrNotBlankValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = NullOrNotBlankValidator.class)
public @interface NullOrNotBlank {

    String message() default "Field must be null or not blank";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}

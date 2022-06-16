package maksimstarikov.sharedlist.annotations;

import maksimstarikov.sharedlist.annotations.handlers.NameValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = NameValidator.class)
public @interface NameOrNull {

    String message() default "Login is not email format";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}

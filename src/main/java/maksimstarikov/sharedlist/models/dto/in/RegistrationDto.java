package maksimstarikov.sharedlist.models.dto.in;

import lombok.Value;
import maksimstarikov.sharedlist.annotations.Email;
import maksimstarikov.sharedlist.annotations.NameOrNull;

import javax.validation.constraints.NotBlank;

@Value
public class RegistrationDto {

    @Email
    String login;

    @NotBlank
    String password;

    @NameOrNull
    String firstName;

    @NameOrNull
    String lastName;
}

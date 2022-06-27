package maksimstarikov.sharedlist.models.dto.in;

import lombok.Value;
import maksimstarikov.sharedlist.annotations.Email;
import maksimstarikov.sharedlist.annotations.NameOrNull;

import javax.validation.constraints.NotBlank;

@Value
public class AuthDto {

    @Email
    String login;

    @NotBlank
    String password;
}

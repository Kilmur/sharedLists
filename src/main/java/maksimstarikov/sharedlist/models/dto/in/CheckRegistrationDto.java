package maksimstarikov.sharedlist.models.dto.in;

import lombok.*;
import maksimstarikov.sharedlist.annotations.Email;

@Data // TODO : почему тут не работает через allArgsConstructor из @Value
public class CheckRegistrationDto {

    @Email
    private String login;
}

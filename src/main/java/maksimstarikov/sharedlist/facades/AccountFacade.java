package maksimstarikov.sharedlist.facades;

import maksimstarikov.sharedlist.models.dto.in.CheckRegistrationDto;
import maksimstarikov.sharedlist.models.dto.in.RegistrationDto;

public interface AccountFacade {

    void checkExistsAccount(CheckRegistrationDto dto);

    void registrationNewAccount(RegistrationDto dto);
}

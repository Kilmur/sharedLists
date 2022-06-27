package maksimstarikov.sharedlist.facades;

import maksimstarikov.sharedlist.models.dto.in.AuthDto;

public interface AuthFacade {

    String authorize(AuthDto dto);
}

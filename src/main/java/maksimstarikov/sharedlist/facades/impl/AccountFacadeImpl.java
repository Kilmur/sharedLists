package maksimstarikov.sharedlist.facades.impl;

import lombok.RequiredArgsConstructor;
import maksimstarikov.sharedlist.exceptions.AccountAlreadyExistException;
import maksimstarikov.sharedlist.facades.AccountFacade;
import maksimstarikov.sharedlist.models.dto.in.CheckRegistrationDto;
import maksimstarikov.sharedlist.models.dto.in.RegistrationDto;
import maksimstarikov.sharedlist.models.entities.Account;
import maksimstarikov.sharedlist.models.entities.Role;
import maksimstarikov.sharedlist.services.AccountService;
import maksimstarikov.sharedlist.utils.UniqueIdGenerator;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.HashSet;

@Service
@RequiredArgsConstructor
public class AccountFacadeImpl implements AccountFacade {

    private final AccountService accountService;
    private final PasswordEncoder passwordEncoder;
    private final UniqueIdGenerator uniqueIdGenerator;

    @Override
    public void checkExistsAccount(CheckRegistrationDto dto) {
        if (accountService.isExistByLogin(dto.getLogin())) {
            throw AccountAlreadyExistException.byLogin(dto.getLogin());
        }
    }

    @Override
    public void registrationNewAccount(RegistrationDto dto) {
        if (accountService.isExistByLogin(dto.getLogin())) {
            throw AccountAlreadyExistException.byLogin(dto.getLogin());
        }
        Account newAccount = Account.builder()
                .uniqueId(uniqueIdGenerator.getNewUniqueId())
                .login(dto.getLogin())
                .password(passwordEncoder.encode(dto.getPassword()))
                .firstName(dto.getFirstName())
                .lastName(dto.getLastName())
                .roles(Collections.singleton(Role.ROLE_USER))
                .build();
        accountService.save(newAccount);
    }
}

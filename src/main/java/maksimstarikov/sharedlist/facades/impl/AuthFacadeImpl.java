package maksimstarikov.sharedlist.facades.impl;

import lombok.RequiredArgsConstructor;
import maksimstarikov.sharedlist.exceptions.AccountOrPasswordIncorrectException;
import maksimstarikov.sharedlist.facades.AuthFacade;
import maksimstarikov.sharedlist.models.dto.in.AuthDto;
import maksimstarikov.sharedlist.models.entities.Account;
import maksimstarikov.sharedlist.security.JwtUtils;
import maksimstarikov.sharedlist.services.AccountService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AuthFacadeImpl implements AuthFacade {

    private final AccountService accountService;
    private final PasswordEncoder passwordEncoder;
    private final JwtUtils jwtUtils;

    @Override
    public String authorize(AuthDto dto) {
        Optional<Account> account = accountService.getByLogin(dto.getLogin());
        if (account.isEmpty() || !passwordEncoder.matches(dto.getPassword(), account.get().getPassword())) {
            throw new AccountOrPasswordIncorrectException("Authorization was failed");
        }
        return jwtUtils.generateToken(dto.getLogin());
    }
}

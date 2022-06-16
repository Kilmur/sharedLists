package maksimstarikov.sharedlist.services.impl;

import lombok.RequiredArgsConstructor;
import maksimstarikov.sharedlist.exceptions.AccountNotFoundException;
import maksimstarikov.sharedlist.services.AccountService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {

    private final AccountService accountService;

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        return accountService.getByLogin(login).orElseThrow(() -> AccountNotFoundException.byLogin(login));
    }
}

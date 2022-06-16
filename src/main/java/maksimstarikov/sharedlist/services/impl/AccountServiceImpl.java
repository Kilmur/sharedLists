package maksimstarikov.sharedlist.services.impl;

import lombok.RequiredArgsConstructor;
import maksimstarikov.sharedlist.models.entities.Account;
import maksimstarikov.sharedlist.repositories.AccountRepository;
import maksimstarikov.sharedlist.services.AccountService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountRepository repository;

    @Override
    public Optional<Account> getByLogin(String login) {
        return repository.findByLogin(login);
    }

    @Override
    public boolean isExistByLogin(String login) {
        return repository.existsAccountByLogin(login);
    }

    @Override
    public boolean isExistByUniqueId(String uniqueId) {
        return repository.existsAccountByUniqueId(uniqueId);
    }

    @Override
    public Account save(Account account) {
        return repository.save(account);
    }
}

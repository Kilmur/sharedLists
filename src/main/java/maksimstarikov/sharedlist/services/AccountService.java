package maksimstarikov.sharedlist.services;

import maksimstarikov.sharedlist.models.entities.Account;

import java.util.Optional;

public interface AccountService {

    Optional<Account> getByLogin(String login);

    Optional<Account> getByLoginWithRoles(String login);

    boolean isExistByLogin(String login);

    boolean isExistByUniqueId(String uniqueId);

    Account save(Account account);

    Account getCurrentAccount();
}

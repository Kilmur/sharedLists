package maksimstarikov.sharedlist.services;

import maksimstarikov.sharedlist.models.entities.AccountList;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface AccountListService {

    List<AccountList> getAllByAccountId(Long accountId);

    AccountList save(AccountList entityForSave);

    Optional<AccountList> getByUuid(UUID uuid);

    void deleteByUuid(UUID uuid);
}

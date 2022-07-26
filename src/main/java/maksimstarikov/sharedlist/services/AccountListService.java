package maksimstarikov.sharedlist.services;

import maksimstarikov.sharedlist.models.entities.AccountList;

import java.util.List;

public interface AccountListService {

    List<AccountList> getAllByAccountId(Long accountId);

    AccountList save(AccountList entityForSave);
}

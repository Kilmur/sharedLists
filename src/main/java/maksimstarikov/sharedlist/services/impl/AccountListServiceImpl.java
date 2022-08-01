package maksimstarikov.sharedlist.services.impl;

import lombok.RequiredArgsConstructor;
import maksimstarikov.sharedlist.models.entities.AccountList;
import maksimstarikov.sharedlist.repositories.AccountListRepository;
import maksimstarikov.sharedlist.services.AccountListService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class AccountListServiceImpl implements AccountListService {

    private final AccountListRepository repository;

    @Override
    public List<AccountList> getAllByAccountId(Long accountId) {
        return repository.findAllByAccountId(accountId);
    }

    @Override
    public AccountList save(AccountList entityForSave) {
        return repository.save(entityForSave);
    }

    @Override
    public Optional<AccountList> getByUuid(UUID uuid) {
        return repository.findByUuid(uuid);
    }
}

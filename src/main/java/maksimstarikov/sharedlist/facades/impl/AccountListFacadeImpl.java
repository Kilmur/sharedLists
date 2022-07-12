package maksimstarikov.sharedlist.facades.impl;

import lombok.RequiredArgsConstructor;
import maksimstarikov.sharedlist.facades.AccountListFacade;
import maksimstarikov.sharedlist.models.dto.out.AccountListsResponse;
import maksimstarikov.sharedlist.models.entities.Account;
import maksimstarikov.sharedlist.models.entities.AccountList;
import maksimstarikov.sharedlist.services.AccountListService;
import maksimstarikov.sharedlist.services.AccountService;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AccountListFacadeImpl implements AccountListFacade {

    private final AccountListService accountListService;
    private final AccountService accountService;
    private final ConversionService conversionService;

    @Override
    public AccountListsResponse getAllAccountLists() {
        Account account = accountService.getByLogin(accountService.getCurrentAccount().getLogin()).orElseThrow();// TODO : что здесь выкинуть?
        List<AccountList> accountLists = accountListService.getAllByAccountId(account.getId());
        return AccountListsResponse.create(accountLists.stream()
                .map(listFromDb -> conversionService.convert(listFromDb, AccountListsResponse.AccountListSummary.class))
                .collect(Collectors.toList()));
    }
}

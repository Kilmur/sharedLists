package maksimstarikov.sharedlist.mapping.accountlist;

import maksimstarikov.sharedlist.models.dto.out.AllAccountsListsResponse;
import maksimstarikov.sharedlist.models.entities.AccountList;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

@Service
public class AccountListToAccountListSummary implements Converter<AccountList, AllAccountsListsResponse.AccountListSummary> {

    @Override
    public AllAccountsListsResponse.AccountListSummary convert(AccountList entity) {
        return AllAccountsListsResponse.AccountListSummary.create(entity.getUuid(), entity.getName(), entity.getColor(), entity.getCreated());
    }
}

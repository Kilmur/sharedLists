package maksimstarikov.sharedlist.mapping.accountlist;

import maksimstarikov.sharedlist.models.dto.out.AccountListsResponse;
import maksimstarikov.sharedlist.models.entities.AccountList;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

@Service
public class AccountListToAccountListSummary implements Converter<AccountList, AccountListsResponse.AccountListSummary> {

    @Override
    public AccountListsResponse.AccountListSummary convert(AccountList entity) {
        return AccountListsResponse.AccountListSummary.create(entity.getUuid(), entity.getName(), entity.getColor());
    }
}

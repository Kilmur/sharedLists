package maksimstarikov.sharedlist.mapping.accountlist;

import maksimstarikov.sharedlist.models.dto.out.AccountListResponse;
import maksimstarikov.sharedlist.models.entities.AccountList;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

@Service
public class AccountListToAccountListResponse implements Converter<AccountList, AccountListResponse> {

    @Override
    public AccountListResponse convert(AccountList entity) {
        return AccountListResponse.create(entity.getUuid(), entity.getName(), entity.getDescription(), entity.getColor());
    }
}

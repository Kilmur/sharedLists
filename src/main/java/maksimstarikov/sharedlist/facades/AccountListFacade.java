package maksimstarikov.sharedlist.facades;

import maksimstarikov.sharedlist.models.dto.in.CreateAccountListDto;
import maksimstarikov.sharedlist.models.dto.in.UpdateAccountListDto;
import maksimstarikov.sharedlist.models.dto.out.AccountListResponse;
import maksimstarikov.sharedlist.models.dto.out.AllAccountsListsResponse;

public interface AccountListFacade {

    AllAccountsListsResponse getAllAccountLists();

    AccountListResponse create(CreateAccountListDto dto);

    AccountListResponse update(UpdateAccountListDto dto);
}

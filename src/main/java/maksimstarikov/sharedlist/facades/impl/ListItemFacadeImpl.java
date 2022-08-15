package maksimstarikov.sharedlist.facades.impl;

import lombok.RequiredArgsConstructor;
import maksimstarikov.sharedlist.exceptions.AccountListNotFoundException;
import maksimstarikov.sharedlist.facades.ListItemFacade;
import maksimstarikov.sharedlist.models.dto.out.AccountListResponse;
import maksimstarikov.sharedlist.models.dto.out.ListItemResponse;
import maksimstarikov.sharedlist.models.dto.out.ListWithItemsResponse;
import maksimstarikov.sharedlist.models.entities.AccountList;
import maksimstarikov.sharedlist.models.entities.ListItem;
import maksimstarikov.sharedlist.services.AccountListService;
import maksimstarikov.sharedlist.services.ListItemService;
import org.springframework.core.convert.ConversionService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ListItemFacadeImpl implements ListItemFacade {

    private final AccountListService accountListService;
    private final ListItemService listItemService;
    private final ConversionService conversionService;

    @Override
    public ListWithItemsResponse getAllByListUuid(UUID listUuid) {
        AccountList accountList = accountListService.getByUuid(listUuid).orElseThrow(() -> AccountListNotFoundException.byUuid(listUuid));
        List<ListItem> listItems = listItemService.getByAccountListId(accountList.getId());
        return ListWithItemsResponse.create(
                conversionService.convert(accountList, AccountListResponse.class),
                listItems.stream()
                        .map(item -> conversionService.convert(item, ListItemResponse.class))
                        .collect(Collectors.toList()));
    }
}

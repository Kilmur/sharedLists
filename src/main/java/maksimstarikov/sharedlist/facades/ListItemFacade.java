package maksimstarikov.sharedlist.facades;

import maksimstarikov.sharedlist.models.dto.in.CreateListItemDto;
import maksimstarikov.sharedlist.models.dto.in.UpdateListItemDto;
import maksimstarikov.sharedlist.models.dto.out.ListItemResponse;
import maksimstarikov.sharedlist.models.dto.out.ListWithItemsResponse;

import java.util.UUID;

public interface ListItemFacade {

    ListWithItemsResponse getAllByListUuid(UUID listUuid);

    ListItemResponse create(CreateListItemDto dto);

    ListItemResponse update(UpdateListItemDto dto);
}

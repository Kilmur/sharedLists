package maksimstarikov.sharedlist.facades;

import maksimstarikov.sharedlist.models.dto.out.ListWithItemsResponse;

import java.util.UUID;

public interface ListItemFacade {

    ListWithItemsResponse getAllByListUuid(UUID listUuid);
}

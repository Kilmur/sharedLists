package maksimstarikov.sharedlist.services;

import maksimstarikov.sharedlist.models.entities.ListItem;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ListItemService {

    List<ListItem> getByAccountListId(Long id);

    ListItem save(ListItem entityForSave);

    Optional<ListItem> getByUuid(UUID uuid);
}

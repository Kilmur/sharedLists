package maksimstarikov.sharedlist.services;

import maksimstarikov.sharedlist.models.entities.ListItem;

import java.util.List;

public interface ListItemService {

    List<ListItem> getByAccountListId(Long id);
}

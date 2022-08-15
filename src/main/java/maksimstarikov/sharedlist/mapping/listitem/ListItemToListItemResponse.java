package maksimstarikov.sharedlist.mapping.listitem;

import maksimstarikov.sharedlist.models.dto.out.ListItemResponse;
import maksimstarikov.sharedlist.models.entities.ListItem;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

@Service
public class ListItemToListItemResponse implements Converter<ListItem, ListItemResponse> {

    @Override
    public ListItemResponse convert(ListItem entity) {
        return ListItemResponse.create(entity.getUuid(), entity.getName());
    }
}

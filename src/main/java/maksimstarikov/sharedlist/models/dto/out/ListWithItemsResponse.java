package maksimstarikov.sharedlist.models.dto.out;

import lombok.Value;

import java.util.List;

@Value(staticConstructor = "create")
public class ListWithItemsResponse {

    AccountListResponse accountList;

    List<ListItemResponse> items;
}

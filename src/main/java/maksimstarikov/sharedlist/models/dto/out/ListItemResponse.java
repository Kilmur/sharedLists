package maksimstarikov.sharedlist.models.dto.out;

import lombok.Value;

import java.util.UUID;

@Value(staticConstructor = "create")
public class ListItemResponse {

    UUID id;

    String name;
}

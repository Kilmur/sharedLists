package maksimstarikov.sharedlist.models.dto.out;

import lombok.Value;

import java.util.UUID;

@Value(staticConstructor = "create")
public class AccountListResponse {

    UUID id;

    String name;

    String description;

    String color;
}

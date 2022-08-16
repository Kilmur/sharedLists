package maksimstarikov.sharedlist.models.dto.in;

import lombok.Value;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Value
public class UpdateListItemDto {

    @NotNull
    UUID listItemId;

    @NotBlank
    String name;
}

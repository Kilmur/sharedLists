package maksimstarikov.sharedlist.models.dto.in;

import lombok.Value;
import maksimstarikov.sharedlist.annotations.NullOrNotBlank;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Value
public class UpdateAccountListDto {

    @NotNull
    UUID id;

    @NullOrNotBlank
    String name;

    String description;

    @NullOrNotBlank
    String color;
}

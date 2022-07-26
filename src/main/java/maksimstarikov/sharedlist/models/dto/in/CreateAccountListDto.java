package maksimstarikov.sharedlist.models.dto.in;

import lombok.Value;

import javax.validation.constraints.NotBlank;

@Value
public class CreateAccountListDto {

    @NotBlank
    String name;

    String description;

    String color;
}

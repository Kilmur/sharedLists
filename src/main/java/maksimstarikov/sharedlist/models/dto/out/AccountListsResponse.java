package maksimstarikov.sharedlist.models.dto.out;

import lombok.Value;

import java.util.List;
import java.util.UUID;

@Value(staticConstructor = "create")
public class AccountListsResponse {

    List<AccountListSummary> summaryList;

    @Value(staticConstructor = "create")
    public static class AccountListSummary {

        UUID id;

        String name;

        String color;
    }
}

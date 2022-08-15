package maksimstarikov.sharedlist.controllers;

import lombok.RequiredArgsConstructor;
import maksimstarikov.sharedlist.facades.ListItemFacade;
import maksimstarikov.sharedlist.models.dto.out.ListWithItemsResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("v1/list-items")
@RequiredArgsConstructor
public class ListItemController {

    private final ListItemFacade facade;

    @GetMapping("by-list-id/{listUuid}")
    public ListWithItemsResponse getAllByListUuid(@PathVariable UUID listUuid) {
        return facade.getAllByListUuid(listUuid);
    }
}

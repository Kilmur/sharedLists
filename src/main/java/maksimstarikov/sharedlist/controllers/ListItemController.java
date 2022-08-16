package maksimstarikov.sharedlist.controllers;

import lombok.RequiredArgsConstructor;
import maksimstarikov.sharedlist.facades.ListItemFacade;
import maksimstarikov.sharedlist.models.dto.in.CreateListItemDto;
import maksimstarikov.sharedlist.models.dto.in.UpdateListItemDto;
import maksimstarikov.sharedlist.models.dto.out.ListItemResponse;
import maksimstarikov.sharedlist.models.dto.out.ListWithItemsResponse;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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

    @PostMapping
    public ListItemResponse create(@RequestBody @Valid CreateListItemDto dto) {
        return facade.create(dto);
    }

    @PutMapping
    public ListItemResponse update(@RequestBody @Valid UpdateListItemDto dto) {
        return facade.update(dto);
    }
}

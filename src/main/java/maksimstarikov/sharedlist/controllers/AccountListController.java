package maksimstarikov.sharedlist.controllers;

import lombok.RequiredArgsConstructor;
import maksimstarikov.sharedlist.facades.AccountListFacade;
import maksimstarikov.sharedlist.facades.AuthFacade;
import maksimstarikov.sharedlist.models.dto.in.AuthDto;
import maksimstarikov.sharedlist.models.dto.out.AccountListsResponse;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("v1/lists")
@RequiredArgsConstructor
public class AccountListController {

    private final AccountListFacade facade;

    @GetMapping
    public AccountListsResponse getAllAccountLists() {
        return facade.getAllAccountLists();
    }
}

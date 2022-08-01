package maksimstarikov.sharedlist.controllers;

import lombok.RequiredArgsConstructor;
import maksimstarikov.sharedlist.facades.AccountListFacade;
import maksimstarikov.sharedlist.models.dto.in.CreateAccountListDto;
import maksimstarikov.sharedlist.models.dto.in.UpdateAccountListDto;
import maksimstarikov.sharedlist.models.dto.out.AccountListResponse;
import maksimstarikov.sharedlist.models.dto.out.AllAccountsListsResponse;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("v1/lists")
@RequiredArgsConstructor
public class AccountListController {

    private final AccountListFacade facade;

    @GetMapping
    public AllAccountsListsResponse getAllAccountLists() {
        return facade.getAllAccountLists();
    }

    @PostMapping
    public AccountListResponse create(@RequestBody @Valid CreateAccountListDto dto) {
        return facade.create(dto);
    }

    @PutMapping
    public AccountListResponse update(@RequestBody @Valid UpdateAccountListDto dto) {
        return facade.update(dto);
    }
}

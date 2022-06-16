package maksimstarikov.sharedlist.controllers;

import lombok.RequiredArgsConstructor;
import maksimstarikov.sharedlist.facades.AccountFacade;
import maksimstarikov.sharedlist.models.dto.in.CheckRegistrationDto;
import maksimstarikov.sharedlist.models.dto.in.RegistrationDto;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("v1/registration")
@RequiredArgsConstructor
public class RegistrationController {

    private final AccountFacade accountFacade;

    @PostMapping("check")
    public void checkExistsAccountForRegistration(@RequestBody @Valid CheckRegistrationDto dto) {
        accountFacade.checkExistsAccount(dto);
    }

    @PostMapping
    public void registrationNewAccount(@RequestBody @Valid RegistrationDto dto) {
        accountFacade.registrationNewAccount(dto);
    }
}

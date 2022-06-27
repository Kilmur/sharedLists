package maksimstarikov.sharedlist.controllers;

import lombok.RequiredArgsConstructor;
import maksimstarikov.sharedlist.facades.AuthFacade;
import maksimstarikov.sharedlist.models.dto.in.AuthDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("v1/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthFacade facade;

    @PostMapping
    public String authorize(@RequestBody @Valid AuthDto dto) {
        return facade.authorize(dto);
    }
}

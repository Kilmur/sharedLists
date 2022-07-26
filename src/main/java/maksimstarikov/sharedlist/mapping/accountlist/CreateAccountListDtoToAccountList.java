package maksimstarikov.sharedlist.mapping.accountlist;

import lombok.RequiredArgsConstructor;
import maksimstarikov.sharedlist.models.dto.in.CreateAccountListDto;
import maksimstarikov.sharedlist.models.entities.AccountList;
import maksimstarikov.sharedlist.services.AccountService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

import static org.apache.logging.log4j.util.Strings.isBlank;

@Service
@RequiredArgsConstructor
public class CreateAccountListDtoToAccountList implements Converter<CreateAccountListDto, AccountList> {

    private final AccountService accountService;

    @Override
    public AccountList convert(CreateAccountListDto dto) {
        return AccountList.create(accountService.getCurrentAccount(),
                dto.getName(),
                dto.getDescription(),
                isBlank(dto.getColor()) ? "#7FFFD4" : dto.getColor()); // TODO : затем из настроек
    }
}

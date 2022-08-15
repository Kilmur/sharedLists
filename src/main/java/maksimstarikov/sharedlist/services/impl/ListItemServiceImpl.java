package maksimstarikov.sharedlist.services.impl;

import lombok.RequiredArgsConstructor;
import maksimstarikov.sharedlist.models.entities.ListItem;
import maksimstarikov.sharedlist.repositories.ListItemRepository;
import maksimstarikov.sharedlist.services.ListItemService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ListItemServiceImpl implements ListItemService {

    private final ListItemRepository repository;

    @Override
    public List<ListItem> getByAccountListId(Long id) {
        return repository.findAllByAccountListId(id);
    }
}

package maksimstarikov.sharedlist.services.impl;

import lombok.RequiredArgsConstructor;
import maksimstarikov.sharedlist.models.entities.ListItem;
import maksimstarikov.sharedlist.repositories.ListItemRepository;
import maksimstarikov.sharedlist.services.ListItemService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ListItemServiceImpl implements ListItemService {

    private final ListItemRepository repository;

    @Override
    public List<ListItem> getByAccountListId(Long id) {
        return repository.findAllByAccountListId(id);
    }

    @Override
    public ListItem save(ListItem entityForSave) {
        return repository.save(entityForSave);
    }

    @Override
    public Optional<ListItem> getByUuid(UUID uuid) {
        return repository.findByUuid(uuid);
    }
}

package maksimstarikov.sharedlist.repositories;

import maksimstarikov.sharedlist.models.entities.ListItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ListItemRepository extends JpaRepository<ListItem, Long> {

    List<ListItem> findAllByAccountListId(Long id);

    Optional<ListItem> findByUuid(UUID uuid);
}

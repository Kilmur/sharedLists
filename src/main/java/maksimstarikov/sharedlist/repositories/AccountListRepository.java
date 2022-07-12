package maksimstarikov.sharedlist.repositories;

import maksimstarikov.sharedlist.models.entities.AccountList;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountListRepository extends JpaRepository<AccountList, Long> {

    List<AccountList> findAllByAccountId(Long accountId);
}

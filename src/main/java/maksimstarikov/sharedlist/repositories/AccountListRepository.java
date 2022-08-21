package maksimstarikov.sharedlist.repositories;

import maksimstarikov.sharedlist.models.entities.AccountList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface AccountListRepository extends JpaRepository<AccountList, Long> {

    List<AccountList> findAllByAccountId(Long accountId);

    Optional<AccountList> findByUuid(UUID uuid);

    @Transactional
    @Modifying
    @Query("delete from AccountList where uuid = :uuid")
    void deleteByUuid(UUID uuid);
}

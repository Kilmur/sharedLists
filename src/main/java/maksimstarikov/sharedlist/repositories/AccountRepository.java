package maksimstarikov.sharedlist.repositories;

import maksimstarikov.sharedlist.models.entities.Account;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Long> {

    Optional<Account> findByLogin(String login);

    @EntityGraph(attributePaths = "roles")
    Optional<Account> findWithRolesByLogin(String login);

    boolean existsAccountByLogin(String login);

    boolean existsAccountByUniqueId(String uniqueId);
}

package maksimstarikov.sharedlist.models.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.Instant;
import java.util.UUID;

@Entity
@Table(schema = "main")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@SequenceGenerator(schema = "main", sequenceName = "account_list_id_seq", name = "account_list_gen", allocationSize = 1)
public class AccountList {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "account_list_gen")
    private Long id;

    @NotNull
    private UUID uuid;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "account_id", nullable = false)
    private Account account;

    @NotBlank
    private String name;

    private String description;

    @NotBlank
    private String color;

    @NotNull
    private Instant created;

    public static AccountList create(Account account, String name, String description, String color) {
        return new AccountList(null, UUID.randomUUID(), account, name, description, color, Instant.now());
    }
}

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
@SequenceGenerator(schema = "main", sequenceName = "list_item_id_seq", name = "list_item_gen", allocationSize = 1)
public class ListItem {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "list_item_gen")
    private Long id;

    @NotNull
    private UUID uuid;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "account_list_id")
    private AccountList accountList;

    @NotBlank
    private String name;

    @NotNull
    private Instant created;

    public static ListItem create(AccountList accountList, String name) {
        return new ListItem(null, UUID.randomUUID(), accountList, name, Instant.now());
    }
}

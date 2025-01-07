package seed_desafio_cdc.book_store.book;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.time.LocalDateTime;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private @NotBlank String name;
    private @NotBlank @Email String email;
    private @NotBlank String description;
    private LocalDateTime createdAt = LocalDateTime.now();

    public Author(@NotBlank String name, @NotBlank @Email String email,
                  @NotBlank @Size(max = 40) String description) {
        this.name = name;
        this.email = email;
        this.description = description;

    }

    @Override
    public String toString() {
        return "Author{" +
                "id='" + id + '\'' +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

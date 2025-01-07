package seed_desafio_cdc.book_store.book;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class NewAuthorRequest {

    @NotBlank
    private String name;
    @NotBlank
    @Email
    private String email;
    @NotBlank
    @Size(max = 400)
    private String description;

    public NewAuthorRequest(@NotBlank String name,
                            @NotBlank @Email String email,
                            @NotBlank @Size(max = 400) String description) {
        super();
        this.name = name;
        this.email = email;
        this.description = description;
    }

    public Author toModel() {
        return new Author( this.name, this.email, this.description);
    }
}

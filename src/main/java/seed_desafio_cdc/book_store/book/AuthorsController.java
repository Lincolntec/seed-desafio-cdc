package seed_desafio_cdc.book_store.book;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class AuthorsController {

    @PostMapping(value = "/authors")
    public String create(@RequestBody @Valid NewAuthorRequest request) {

        System.out
                .println(
                        "Test de URI"
                );

        return "Creating authors...";
    }
}

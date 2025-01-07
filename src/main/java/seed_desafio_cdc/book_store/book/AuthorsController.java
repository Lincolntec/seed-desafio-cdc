package seed_desafio_cdc.book_store.book;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
//2
public class AuthorsController {

    @PersistenceContext
    private EntityManager manager;

    @PostMapping(value = "/authors")
    @Transactional
    //1
    //2
    public String create(@RequestBody @Valid NewAuthorRequest request) {
        Author author = request.toModel();
        manager.persist(author);
        return author.toString();
    }
}

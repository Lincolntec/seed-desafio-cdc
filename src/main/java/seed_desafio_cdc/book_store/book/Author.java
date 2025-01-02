package seed_desafio_cdc.book_store.book;

import jakarta.persistence.TemporalType;
import org.springframework.data.jpa.repository.Temporal;

import java.util.Date;

public class Author {

    private String name;


    private String email;
    private String description;



    private Date dateAt;
}

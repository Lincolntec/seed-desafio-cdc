public class Author {

    private String name;
    private String email;
    private String description;

    @NotNull
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date dateAt;
}

public class Book {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String author;
    private String category;
    private int quantity;
}
public class Review {
    @Id
    @GeneratedValue
    private Long id;
    private Long bookId;
    private String reviewText;
    private int rating;
}
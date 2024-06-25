public class Transaction {
    @Id
    @GeneratedValue
    private Long id;
    private Long bookId;
    private Long memberId;
    private Date borrowDate;
    private Date returnDate;
}
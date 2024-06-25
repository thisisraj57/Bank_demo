public class AccountController {

    @PostMapping
    public Account createAccount(@RequestBody Account account) {
        // Save the account to the database
        return account;
    }

    @GetMapping("/{accountId}")
    public Account getAccount(@PathVariable("accountId") Long accountId) {
        // Get the account from the database
        return account;
    }

}
public class User {
    private String firstName;
    private String lastName;
    private String cpf;
    private Account account;

    public User(String firstName, String lastName, String cpf) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.cpf = cpf;
        this.account = new Account();
    }

    public Account getAccount() {
        return this.account;
    }
}

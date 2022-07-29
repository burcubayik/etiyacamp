package kosgeb.entities;
public class BankUser {

    private int id;
    private User user;
    private Bank bank;

    public BankUser() {
    }

    public BankUser(int id, User user, Bank bank) {
        this.id = id;
        this.user = user;
        this.bank = bank;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }
}

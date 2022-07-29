package kosgeb.entities;

import java.util.List;

public class Bank {
    private int id;
    private String bankName;
    private List<BankUser> bankUsers;

    public Bank() {
    }

    public Bank(int id, String bankName,List<BankUser> bankUsers) {
        this.id = id;
        this.bankName = bankName;
        this.bankUsers = bankUsers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

	public List<BankUser> getBankUsers() {
		return bankUsers;
	}

	public void setBankUsers(List<BankUser> bankUsers) {
		this.bankUsers = bankUsers;
	}
    
}

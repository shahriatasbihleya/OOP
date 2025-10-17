// ID : 02724205101138
public class BankAccount {
    
    private String accountNumber;
    private double balance;

    
    public String getAccountNumber() {
        return accountNumber;
    }

    
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    
    public double getBalance() {
        return balance;
    }

    
    public void setBalance(double balance) {
        this.balance = balance;
    }

    
    public static void main(String[] args) {
        
        BankAccount account1 = new BankAccount();

        
        account1.setAccountNumber("02724205101138");
        account1.setBalance(5646563.500);

       
        System.out.println("Account Number: " + account1.getAccountNumber());
        System.out.println("Balance: $" + account1.getBalance());
    }
}


    
   
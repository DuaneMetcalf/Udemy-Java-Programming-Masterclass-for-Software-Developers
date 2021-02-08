package udemy.javaprogramming;

public class BankAccount
{

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount()
    {
        this(987321, 2.50, "No Name", "No Email", "No Phone");
    }

    public BankAccount(int accountNumber, double balance, String customerName, String email, String phoneNumber)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber()
    {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public String getCustomerName()
    {
        return customerName;
    }

    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public void addFunds(double amount)
    {
        System.out.println("Balance = " + balance);
        this.balance += amount;
        System.out.println("Deposit of " + amount + " completed. New balance = " + this.balance);
    }

    public void withdrawFunds(double amount)
    {
        System.out.println("Balance = " + balance);
        if (amount > this.balance)
        {
            System.out.println("Not enough funds to withdraw " + amount + " from " + this.balance);
        }
        else
        {
            this.balance -= amount;
            System.out.println("Withdrawal of " + amount + " completed. New balance = " + this.balance);
        }
    }

}

public class VIPCustomer
{

    private String customerName;
    private double creditLimit;
    private String customerEmail;

    public VIPCustomer()
    {
        this("Default Name", 0.00, "noemail@noaddress.com");
    }

    public VIPCustomer(String customerName, String customerEmail)
    {
        this(customerName, 0.00, customerEmail);
    }

    public VIPCustomer(String customerName, double creditLimit, String customerEmail)
    {
        this.customerName = customerName;
        this.creditLimit = creditLimit;
        this.customerEmail = customerEmail;
    }

    public String getCustomerName()
    {
        return customerName;
    }

    public double getCreditLimit()
    {
        return creditLimit;
    }

    public String getCustomerEmail()
    {
        return customerEmail;
    }

}
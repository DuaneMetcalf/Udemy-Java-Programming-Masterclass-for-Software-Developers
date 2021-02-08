public class Main
{

    public static void main(String[] args)
    {
        BankAccount myAccount = new BankAccount(12345, 0.00, "John Doe",
                "john@doemail.com", "0191 123 4567");
        myAccount.withdrawFunds(100.0);
        myAccount.addFunds(50.0);
        myAccount.withdrawFunds(100.0);
        myAccount.addFunds(51.0);
        myAccount.withdrawFunds(100.0);

        VIPCustomer person1 = new VIPCustomer();
        System.out.println(person1.getCustomerName());

        VIPCustomer person2 = new VIPCustomer("John Doe", "john@doe.com");
        System.out.println("Name: " + person2.getCustomerName() + " Credit Limit: " + person2.getCreditLimit());

        VIPCustomer person3 = new VIPCustomer("TestPerson", 1000.00, "person@email.com");
        System.out.println(person3.getCustomerName());
    }

}
package drm.duanemetcalf;
/*
 * Author: Duane Metcalf
 * Package : drm.duanemetcalf
 * Project : AutoboxingAndUnboxingChallenge
 * Class : Branch
 * Created: Mon, 26 Oct 2020
 */

import java.util.ArrayList;

public class Branch
{

    private String branchName;
    private ArrayList<Customer> customers;

    public Branch(String branchName)
    {
        this.branchName = branchName;
        this.customers = new ArrayList<Customer>();
    }

    public String getBranchName()
    {
        return branchName;
    }

    public void showCustomers()
    {
        for (int i = 0; i < customers.size(); i++)
        {
            System.out.println("Customer " + (i + 1) + ": " + customers.get(i).getCustomerName());
            customers.get(i).showTransactions();
        }
    }

    private Customer selectedCustomer(String name)
    {
        for (int i = 0; i < customers.size(); i++)
        {
            Customer customer = this.customers.get(i);
            if (customer.getCustomerName().equals(name))
            {
                return customer;
            }
        }
        return null;
    }

    public void addCustomer(String name, double openingAmount)
    {
        Customer customer = new Customer(name, openingAmount);
        if (isCustomer(name))
        {
            System.out.println(name + " is already set up as a customer");
        }
        else
        {
            newCustomer(customer);
        }
    }

    public void addCustomerTransaction(String name, double amount)
    {
        if (isCustomer(name))
        {
            Customer customer = selectedCustomer(name);
            customer.addTransaction(amount);
        }
        else
        {
            System.out.println("Customer: " + name + " not found");
        }
    }

    private boolean isCustomer(String name)
    {
        for (int i = 0; i < customers.size(); i++)
        {
            if (customers.get(i).getCustomerName().equals(name))
            {
                return true;
            }
        }
        return false;
    }

    private void newCustomer(Customer customer)
    {
        System.out.println("Customer: " + customer.getCustomerName() + " added.");
        customers.add(customer);
    }

}

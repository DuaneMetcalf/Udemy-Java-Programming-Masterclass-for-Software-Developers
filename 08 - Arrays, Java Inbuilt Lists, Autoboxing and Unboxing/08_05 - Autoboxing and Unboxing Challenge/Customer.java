package drm.duanemetcalf;
/*
 * Author: Duane Metcalf
 * Package : drm.duanemetcalf
 * Project : AutoboxingAndUnboxingChallenge
 * Class : Customer
 * Created: Mon, 26 Oct 2020
 */

import java.util.ArrayList;

public class Customer
{

    private String customerName;
    private ArrayList<Double> transactions;

    public Customer(String customerName, double amount)
    {
        this.customerName = customerName;
        this.transactions = new ArrayList<Double>();

        if (isValidAmount(amount))
        {
            addTransaction(amount);
        }
        else
        {
            System.out.println("Invalid amount: Must be greater than 0.0");
            addTransaction(0.0);
        }
    }

    public String getCustomerName()
    {
        return customerName;
    }

    private boolean isValidAmount(double amount)
    {
        if (amount > 0.0)
        {
            return true;
        }
        return false;
    }

    public void addTransaction(double amount)
    {
        this.transactions.add(amount);
    }

    public void showTransactions()
    {
        for (int i = 0; i < transactions.size(); i++)
        {
            System.out.println(("Tx " + i + 1) + ": " + transactions.get(i).doubleValue());
        }
    }

}

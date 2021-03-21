package drm.duanemetcalf;
/*
 * Author: Duane Metcalf
 * Package : drm.duanemetcalf
 * Project : AutoboxingAndUnboxingChallenge
 * Class : Bank
 * Created: Mon, 26 Oct 2020
 */

import java.util.ArrayList;

public class Bank
{

    private String name;
    private ArrayList<Branch> branches;
    private Branch currentBranch = null;

    public Bank(String name)
    {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public void addBranch(String name)
    {
        if (isBranch(name))
        {
            System.out.println("Branch: " + name + " is already set up");
        }
        else
        {
            newBranch(name);
        }
    }

    public void deleteBranch(String name)
    {
        if (isBranch(name))
        {
            removeBranch(selectedBranch(name));
        }
        else
        {
            System.out.println("Branch: " + name + " not found!");
        }
    }

    public void editBranch(String oldName, String newName)
    {
        if (isBranch(oldName))
        {
            if (isBranch(newName))
            {
                System.out.println("Branch: " + newName + " is already set up");
            }
            else
            {
                int index = branches.indexOf(selectedBranch(oldName));
                Branch branch = new Branch(newName);
                branches.set(index, branch);
            }
        }
        else
        {
            System.out.println("Branch: " + oldName + " not found!");
        }
    }

    public void listBranches()
    {
        if (branches.size() <= 0)
        {
            System.out.println("No branches set up");
        }
        else
        {
            for (int i = 0; i < branches.size(); i++)
            {
                System.out.println("Branch " + (i + 1) + ": " + branches.get(i).getBranchName());
                System.out.println("Customers:");
                branches.get(i).showCustomers();
                System.out.println(" ***** ");
            }
        }
    }

    private void removeBranch(Branch branch)
    {
        int index = branches.indexOf(branch);
        if (index >= 0)
        {
            branches.remove(index);
        }
        else
        {
            System.out.println("Error removing branch");
        }
    }

    public void queryBranch(String name)
    {
        if (isBranch(name))
        {
            System.out.println("Branch: " + name + " found");
        }
        else
        {
            System.out.println("Branch: " + name + " not found!");
        }
    }

    private void newBranch(String name)
    {
        Branch branch = new Branch(name);
        branches.add(branch);
    }

    private Branch selectedBranch(String name)
    {
        for (int i = 0; i < branches.size(); i++)
        {
            Branch branch = branches.get(i);
            if (branch.getBranchName().equals(name))
            {
                return branch;
            }
        }
        return null;
    }

    public Branch selectBranch(String name)
    {
        if (isBranch(name))
        {
            currentBranch = selectedBranch(name);
            return currentBranch;
        }
        return null;
    }

    private boolean isBranch(String name)
    {
        for (int i = 0; i < branches.size(); i++)
        {
            if (branches.get(i).getBranchName().equals(name))
            {
                return true;
            }
        }
        return false;
    }

    public void addCustomer(String name, double openingAmount)
    {
        if (currentBranch != null)
        {
            currentBranch.addCustomer(name, openingAmount);
        }
        else
        {
            System.out.println("A branch has not been selected");
        }
    }

    public void addCustomerTransaction(String name, double amount)
    {
        if (currentBranch != null)
        {
            currentBranch.addCustomerTransaction(name, amount);
        }
        else
        {
            System.out.println("A branch has not been selected");
        }
    }

}

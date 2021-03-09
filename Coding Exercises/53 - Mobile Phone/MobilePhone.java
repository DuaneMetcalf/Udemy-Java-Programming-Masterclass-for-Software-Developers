import java.util.ArrayList;

public class MobilePhone 
{

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String phoneNumber)
    {
        this.myNumber = phoneNumber;
        this.myContacts = new ArrayList<>();
    }

    
    public boolean addNewContact(Contact contact)
    {
        
        if (findContact(contact.getName()) >= 0)
        {
            return false;
        }
        
        this.myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact)
    {
        if(queryContact(oldContact.getName()).equals(queryContact(newContact.getName())))
        {
            return false;
        }

        this.myContacts.set(findContact(oldContact), newContact);
        return true;

    }

    public boolean removeContact(Contact contact)
    {
        if (findContact(contact) != -1)
        {
            this.myContacts.remove(contact);
            return true;
        }
        
        return false;
    }

    private int findContact(Contact contact)
    {
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String contactName)
    {
            for(int i = 0; i < this.myContacts.size(); i++)
            {
                if (this.myContacts.get(i).getName().equals(contactName))
                {
                    return i;
                }
            }

            return -1;
    }

    public Contact queryContact(String contactName)
    {
        int contactIndex = findContact(contactName);
        if(contactIndex >= 0)
        {
            return this.myContacts.get(contactIndex);
        }

        return null;
    }

    public void printContacts()
    {
        System.out.println("Contact List:");

        for (Contact c : this.myContacts) 
        {
            System.out.println((findContact(c) + 1) +  ". " + c.getName() + " -> " + c.getPhoneNumber());
        }            
    }
    
}

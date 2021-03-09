import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> contactList = new ArrayList<Contact>();

    public void addContact(String name, String number){
        Contact contact = new Contact(name, number);
        if (isContact(name)){
            System.out.println(name + " is already in your contact list \n");
        }
        else{
            System.out.println(name + " added to your contact list \n");
            contactList.add(contact);
        }
    }

    private boolean isContact(String name){
        if (queryContact(name) != null){
            return true;
        }
        return false;
    }

    private Contact queryContact(String name){
        for (int i = 0; i < contactList.size(); i++){
            if (contactList.get(i).getName().equals(name)){
                return contactList.get(i);
            }
        }
        return null;
    }

     public void searchContact(String name){
        if (queryContact(name) != null){
            Contact contact = queryContact(name);
            System.out.println("Name: " + contact.getName() + " -- Number: " + contact.getPhoneNumber());
        }else{
            System.out.println(name + " not found in contact list");
        }
    }

    public void displayContacts(){
        System.out.println("Contact list has " + contactList.size() + " entries");
        for (int i = 0; i < contactList.size(); i++){
            System.out.println((i + 1) + ": " + contactList.get(i).getName() + " -- " + contactList.get(i).getPhoneNumber());
        }
    }

    public void deleteContact(String name){
        if (isContact(name)){
            System.out.println(name + " removed from contact list \n");
            contactList.remove(contactIndex(name));
        }else{
            System.out.println(name + " not found \n");
        }
    }

    private int contactIndex(String name){
        if(isContact(name)){
            int index = contactList.indexOf(queryContact(name));
            if (index >= 0){
                return index;
            }
        }
        return -1;
    }

    public void modifyContact(String oldContact, String newContact, String newNumber){
        if (isContact(oldContact)){
            if(isContact(newContact)){
                System.out.println(newContact + " is already in your contact list");
            }else{
                int index = contactIndex(oldContact);
                Contact contact = new Contact(newContact, newNumber);
                System.out.println(oldContact + " has been updated to " + newContact + " with number " + newNumber);
                contactList.set(index, contact);
            }
        }else{
            System.out.println(oldContact + " is not in your contact list");
        }
    }
}

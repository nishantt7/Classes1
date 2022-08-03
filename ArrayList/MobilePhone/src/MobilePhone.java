import java.util.ArrayList;
public class MobilePhone {
    private ArrayList<Contact> contactList = new ArrayList<>();
    public void addContact(Contact contact)
    {
        if (findIndexOfContact(contact) > 0) {
            System.out.println("Contact already exists");
        } else
            contactList.add(contact);
    }
    public int findIndexOfContact(Contact contact) {
        return contactList.indexOf(contact);
    }
    public void removeContact(Contact contact) {
        contactList.remove(contact);
        System.out.println(contact.getName() + " " + contact.getPhoneNumber() + " " + "removed");
    }
    public void removeContact(String name) {
        for (int i = 0; i < contactList.size(); i++) {
            if (!contactList.get(i).getName().equals(name)) {
                System.out.println("Contact name you want to remove does not exits in the contact list");
            } else {
                Contact foundContact = contactList.get(i);
                removeContact(foundContact);
            }
        }
    }
    public boolean updateContact(String existingContactName, Contact newContact)
    {
        int index=getPosition(existingContactName);
        if(index>=0)
        {
            updateContact(index,newContact);
            return true;
        }
        else
            return false;
    }
    public void updateContact(int index,Contact newContact)
    {
        contactList.set(index,newContact);
    }
    public int getPosition(String contactName)
    {
        for (int i = 0; i < contactList.size(); i++)
        {
            if (contactList.get(i).getName().equals(contactName))
            {
                return i;
            }
        }
        return -1;
    }
    public void printContactList()
    {
        for(int i=0;i<contactList.size();i++)
        {
            System.out.println(i+1 + ". ->" + contactList.get(i).getName() + " " + contactList.get(i).getPhoneNumber());
        }
    }
}
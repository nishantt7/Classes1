import java.util.Scanner;

public class Runner {
    public static MobilePhone mob = new MobilePhone();
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Boolean quit = true;
        while (quit) {
            System.out.println("Enter the option you want");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter the name of the contact");
                    String contactName = sc.next();
                    System.out.println("Enter the phone number of the contact");
                    String contactPhoneNumber = sc.next();
                    Contact contactInputByuser = Contact.contact(contactName, contactPhoneNumber);
                    mob.addContact(contactInputByuser);
                    break;
                case 2:
                    System.out.println("Enter the contact name you want to remove");
                    String removeContact = sc.next();
                    mob.removeContact(removeContact);
                    break;
                case 3:
                    System.out.println("Enter the contact name you want to update");
                    String existingContactName = sc.next();
                    System.out.println("Enter the new contact's name");
                    String newContactName = sc.next();
                    System.out.println("Enter the new contact's number");
                    String newContactNumber = sc.next();
                    Contact newContact = Contact.contact(newContactName, newContactNumber);
                    if(mob.updateContact(existingContactName, newContact))
                    {
                        System.out.println("Contact upadted successfully");}
                    else {
                        System.out.println("Error updating the record");}
                    break;
                case 4:
                    mob.printContactList();
                    break;
                case 5:
                    quit = false;
                    break;
            }
        }
    }
}

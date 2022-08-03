public class Contact {
    private String contactName;
    private String phoneNumber;
    public Contact(String contactName,String phoneNumber)
    {
        this.contactName=contactName;
        this.phoneNumber=phoneNumber;
    }
    public String getName()
    {
        return this.contactName;
    }
    public String getPhoneNumber()
    {
        return this.phoneNumber;
    }
    public static Contact contact(String contactName,String phoneNumber)
    {
        return new Contact(contactName,phoneNumber);
    }
}

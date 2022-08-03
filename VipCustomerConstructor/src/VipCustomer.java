public class VipCustomer {
    String name;
    double creditLimit;
    String emailAddress;
    public VipCustomer()
    {
        this("ABC",5000,"ABC@gmail.com");
        System.out.println("default constructor");
    }
    public VipCustomer(String name,double creditLimit)
    {
        this(name,creditLimit,"jugnu@gmail.com");
        System.out.println("constructor with two parameter");
    }
    public VipCustomer(String name,double creditLimit,String emailAddress)
    {
        System.out.println("constructor with three parameter");
        this.name=name;
        this.creditLimit=creditLimit;
        this.emailAddress=emailAddress;
        System.out.println(this.name + " " + this.emailAddress + " " + this.creditLimit);
    }
}

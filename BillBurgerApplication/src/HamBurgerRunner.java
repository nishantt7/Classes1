import java.util.Scanner;

public class HamBurgerRunner {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.print("Which hamburger you want" + "\n" + "1.Normal Hamburger" + "\n" + "2.Healthy Burger" + "\n"+ "3.Customized Burger" + "\n"+ "Press 1,2 or 3");
        int burgerType = in.nextInt();
        switch(burgerType)
        {
            case 1:
                //NormalHamburger normalHamburger=new NormalHamburger("Enter 1 for tomato" + " " +"2 for Cucumber" + " "+ "3 for Carrot" + " " + "4 for lettuce");
                BaseHamburger normalHamburger=new NormalHamburger("Enter 1 for tomato" + " " +"2 for Cucumber" + " "+ "3 for Carrot" + " " + "4 for lettuce");
                //both parent reference and child can be used, since we are not calling any child specific methods and we are aware in advance which object type we will have
                break;
            case 2:
                HealthyHamburger healthyHamburger=new HealthyHamburger("Enter 1 for tomato" + " " +"2 for Cucumber" + " "+ "3 for Carrot" + " " + "4 for lettuce" + "5 for chanamasala");
                break;
            case 3:
                CustomizedBurger customizedBurger=new CustomizedBurger("Enter 1 for tomato" + " " +"2 for Cucumber" + " "+ "3 for Carrot" + " " + "4 for lettuce" + "5 for chanamasala" + " "+ "6 for mayonise" + " " + "7 for extra cheese");
                break;
            default:
                System.out.println("wrong option input");
        }
    }
}

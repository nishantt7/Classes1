public class CustomizedBurger extends BaseHamburger{
    String addOnOptions;
    public int[] customizedHamburgerAddOns()
    {
        System.out.print("How many addons you want" + " " + "Press 1,2,3,4,5,6");
        int noOfaddOns = in.nextInt();
        return new int[noOfaddOns];
    }
    public void getCost()
    {
        int healthyBurgerCost=costCalculator(customizedHamburgerAddOns(),addOnOptions);
        int finalNormalBurgerCost=healthyBurgerCost+super.getNormalHamburgerBreadCost();
        System.out.println(finalNormalBurgerCost);
    }
    public CustomizedBurger(String addOnOptions)
    {
        this.addOnOptions=addOnOptions;
        getCost();
    }
}



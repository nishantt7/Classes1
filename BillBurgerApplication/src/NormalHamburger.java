public class NormalHamburger extends BaseHamburger{
    String addOnOptions;
    public int[] normalHamburgerAddOns()
    {
            System.out.print("How many addons you want" + " " + "Press 1,2,3,4");
            int noOfaddOns = super.in.nextInt();
            return new int[noOfaddOns];
    }
    public void getCost()
    {
        int normalBurgerCost=super.costCalculator(normalHamburgerAddOns(),addOnOptions);
        int finalNormalBurgerCost=normalBurgerCost+super.getNormalHamburgerBreadCost();
        System.out.println("your burger cost is "+ finalNormalBurgerCost);
    }
    public NormalHamburger(String addOnOptions)
    {
        this.addOnOptions=addOnOptions;
        getCost();
    }
}

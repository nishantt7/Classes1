public class HealthyHamburger extends BaseHamburger{
    String addOnOptions;
    public int[] healthyHamburgerAddOns()
    {
        System.out.print("How many addons you want" + " " + "Press 1,2,3,4,5");
        int noOfaddOns = super.in.nextInt();
        int arr[]=new int[noOfaddOns];
        //return new int[noOfaddOns];
        return arr;
    }
    public void getCost()
    {
        int healthyBurgerCost=costCalculator(healthyHamburgerAddOns(),addOnOptions);
        int finalNormalBurgerCost=healthyBurgerCost+super.getMultiGrainBreadCost();
        System.out.println(finalNormalBurgerCost);
    }
    public HealthyHamburger(String addOnOptions)
    {
        this.addOnOptions=addOnOptions;
        getCost();
    }
}

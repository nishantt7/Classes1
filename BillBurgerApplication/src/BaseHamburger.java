import java.util.Scanner;
public class BaseHamburger
{
    Scanner in = new Scanner(System.in);
    private int normalHamburgerBreadCost=10;
    private int tomatoCost=15;
    private int carrotCost=20;
    private int cucumberCost=25;
    private int lettuceCost=30;
    private int multiGrainBreadCost=50;
    private int chanaMasalaCost=20;
    private int mayoniseCost=20;
    private int extraCheeseCost=40;
    private int totalCost=0;
    public int costCalculator(int arr[],String a)
    {
        System.out.println(a);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();}
        for (int b : arr) {
            if (b==1) {
                totalCost = totalCost + tomatoCost;
            } else if (b==2) {
                totalCost = totalCost + cucumberCost;
            } else if (b==3) {
                totalCost = totalCost + carrotCost;
            } else if (b==4) {
                totalCost = totalCost + lettuceCost;
            } else if (b==5) {
                totalCost = totalCost + chanaMasalaCost;
            } else if (b==6) {
                totalCost = totalCost + mayoniseCost;
            } else if (b==7) {
                totalCost = totalCost + extraCheeseCost;
            }
        }
        return totalCost;
    }
    public int getTomatoCost() {
        return tomatoCost;
    }
    public int getCarrotCost() {
        return carrotCost;
    }
    public int getCucumberCost() {
        return cucumberCost;
    }
    public int getLettuceCost() {
        return lettuceCost;
    }
    public int getMultiGrainBreadCost() {
        return multiGrainBreadCost;
    }
    public int getChanaMasalaCost() {
        return chanaMasalaCost;
    }
    public int getMayoniseCost() {
        return mayoniseCost;
    }
    public int getExtraCheeseCost() {
        return extraCheeseCost;
    }
    public int getNormalHamburgerBreadCost()
    {
        return normalHamburgerBreadCost;
    }
}

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayListRunner {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        GroceryList obj = new GroceryList();
        boolean quit=true;
        while(quit)
        {
            int option = instructions();
            switch (option)
            {
                case 1:
                    System.out.println("Input the item you want to add");
                    String addItem = sc.next();
                    obj.addItem(addItem);
                    break;
                case 2:
                    System.out.println("Input the item you want to remove");
                    String removeItem = sc.next();
                    obj.removeItem(removeItem);
                    break;
                case 3:
                    System.out.println("Input the item you want to replace");
                    String replaceItem = sc.next();
                    System.out.println("Input the new item");
                    String newItem = sc.next();
                    obj.replaceItem(replaceItem, newItem);
                    break;
                case 4:
                    obj.printList();
                    break;
                case 5:
                    System.out.println("Input the item you want to know the position of");
                    String itemIndex = sc.next();
                    System.out.println(obj.getPosition(itemIndex));
                    break;
                case 6:
                    quit=false;
                    break;
            }
        }
    }
    public static int instructions()
    {
        int a=0;
        System.out.println("Press 1 for item addition" + "\n" + "Press 2 for item removal" + "\n" + "Press 3 for item replacement" + "\n" + "Press 4 to check the list"+"\n"+"Press 5 to get the position of the item"+"\n"+"Press 6 to quit");
        try
        {
            a=sc.nextInt();
        }
        catch(InputMismatchException e)
        {
            instructions();
        }
        return a;
    }
}
import java.util.ArrayList;
import java.util.Iterator;
public class GroceryList {
    ArrayList<String> groceryList =new ArrayList<>();
    public void addItem(String item)
    {
        if(!groceryList.contains(item))
            groceryList.add(item);
        else
            System.out.println("Item already there");
    }
    public void removeItem(String item)
    {
        if(groceryList.contains(item)) {
            groceryList.remove(item);
            System.out.println("Item removed successfully");
        }
        else
        {
            System.out.println("Item is not in the list");
        }
    }
    public void replaceItem(String oldItem,String newItem)
    {
        int oldItemIndex=getPosition(oldItem);
        removeItem(oldItem);
        groceryList.add(oldItemIndex,newItem);
    }
    public int getPosition(String item)
    {
        if(groceryList.contains(item))
        {
            return groceryList.indexOf(item)+1;
        }
        else
            return 0;
    }
    public void printList()
    {
        Iterator itr=groceryList.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next().toString());
        }
    }
    public boolean findItem(String item)
    {
        return groceryList.contains(item);
    }
}

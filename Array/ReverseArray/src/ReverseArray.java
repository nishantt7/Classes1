import java.util.Arrays;
public class ReverseArray
{
    static int arr[]={1,2,3,4,5,6};
    public static void main(String[] args)
    {
          int array[]=reverseArray(arr);
          System.out.println(Arrays.toString(array));
    }
    public static int[] reverseArray(int arr[])
    {
        int temp;
        int maxindex=arr.length-1;
        for(int i=0;i<arr.length/2;i++)
        {
            temp=arr[i];
            arr[i]=arr[maxindex-i];
            arr[maxindex-i]=temp;
        }
        return arr;
    }
}



import java.util.Arrays;
import java.util.Scanner;
public class SortArray {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Enter the no. of elements you want to input in the array");
        int number = sc.nextInt();
        int array[] = fillArray(number);
        int finalArray[] = sortArray(array);
        System.out.println(Arrays.toString(finalArray));
    }
    public static int[] fillArray(int number)
    {
        int arr[] = new int[number];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static int[] sortArray(int arr[])
    {
        int temp;
        for (int i=0; i<arr.length; i++)
        {
            for (int j=i+1; j<arr.length; j++)
            {
                if (arr[j]<arr[i])
                {
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        return arr;
    }
}

import java.util.Scanner;

public class MinElement {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println("Enter the no. of elemets you want in the array");
        int number = sc.nextInt();
        int arr[]=new int[number];
        int filledArray[]=fillArray(arr);
        System.out.println(minElement(filledArray));
    }
    public static int[] fillArray(int arr[]) {
        System.out.println("Enter the numbers you want to input in the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static int minElement(int arr[])
    {
        int min=arr[0];
        for (int i=0;i<arr.length;i++)
        {
            if(arr[i]<arr[0])
            {
                min=arr[i];
            }
        }
        return min;
    }
}

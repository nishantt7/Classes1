public class SecondLargest
{
    public static void main(String[] args)
    {
        //int arr[]={42,28,43,26,65,60,54,51,35,51,42,48,33,40,58,38,64,47,44,49,46,25,57,39,55,45,29,32,61,53,31,36,56,63,30,52,27,34,50,41,37,66,62,59};
        int arr[]={37,61,30,28,47,42,25,41,56,27,45,44,34,46,35,58,36,60,29,53,55,32,31,33,59,50,51,52,37,39,38,43,49,54,57,40,26,48};
        System.out.println(print2largest(arr));
    }
    public static int print2largest(int arr[])
    {
        int largest=0;
        int indexOflargest=0;
        largest=arr[0];
        int a=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                largest=arr[i];
                indexOflargest=i;
            }
        }
        int secondLargest=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>secondLargest & arr[i]!=arr[indexOflargest])
            {
                secondLargest=arr[i];
            }
        }
        return secondLargest;
    }
}


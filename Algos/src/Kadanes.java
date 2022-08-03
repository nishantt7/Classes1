public class Kadanes {
    public static void main(String[] args)
    {
        //int arr1[]={-10,-2,-5,-6,-19,-99,-1};
        //int arr1[]={-1,-2,-5,-6,-19,-99};
        int arr1[]={-10,-2,-1,-6,-19,-99};
        negativeNumArray(arr1);
        //int arr[]={4,-2,-3,5,7,9,-6};
//        int arr[]={4,-8,-3,5,7,9,-6};
//        //int arr[]={10,-5,-6,2};
//        int currSum=0;
//        int maxSum=0;
//        int start=0;
//        int end=0;
//        for (int i=0;i<arr.length;i++)
//        {
//            currSum=currSum+arr[i];
//            if(maxSum<currSum)
//            {
//                maxSum=currSum;
//                end=i;
//            }
//            if(currSum<0)
//            {
//                currSum=0;
//                start=i+1;
//                end=i+1;
//            }
//        }
//        System.out.println(maxSum);
//        System.out.println(start);
//        System.out.println(end);
    }
    public static void negativeNumArray(int arr[])
    {
        int currSum=0;
        int maxSum=-1000;
        int end=0;
        int start=0;
        for(int i=0;i<arr.length;i++)
        {
            currSum=currSum+arr[i];
            if(currSum>maxSum)
            {
                maxSum=currSum;
                end=i;
                start=i;
            }
            if(currSum<maxSum)
            {
                currSum=0;
//                start=i+1;
//                end=i+1;
            }
        }
        System.out.println(maxSum);
        System.out.println(start);
        System.out.println(end);
    }
}


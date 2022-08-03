public class test2 {
    public static void main(String[] args)
    {
        int arr[]={10,20,30,40,50};
        streamAvg(arr);
    }
    public static void streamAvg(int[] arr)
    {
        float avg[]=new float[arr.length];
        int i=0;
        float Sum=0;
        while (i<arr.length)
        {
            Sum=Sum+arr[i];
            avg[i]=Sum/(i+1);
            i++;
        }
        for(float a:avg)
        {
            System.out.println(a);
        }

    }
}


public class Test3 {
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,18,19};
        int k = 3;
        int temp = 0;
        int temp1 = 0;
        for (int i = 0; i <= k - 1;)
        {
            temp = arr[i];
            arr[i] = arr[k-1];
            arr[k-1] = temp;
            i = i + 3;
            k = k + 3;
            if ((arr.length - i) == 2)
            {
                temp1 = arr[arr.length-1];
                arr[arr.length-1] = arr[arr.length - 2];
                arr[arr.length - 2] = temp1;
                break;
            }
            if ((arr.length - i) == 1)
            {
                break;
            }
            if(arr.length==i)
            {
                break;
            }
        }
        for(int a=0;a<arr.length;a++) {
            System.out.println(arr[a]);
        }
    }
}
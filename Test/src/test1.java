public class test1 {
    public static void main(String[] args)
    {
        int v[]={10,45,89,56,90,77};
        System.out.println(find_median(v));
    }
        public static int find_median(int[] v)
        {
            int median=0;
            int temp=0;
            for (int i=0;i<v.length;i++)
            {
                for(int j=i+1;j<v.length;j++)
                {
                    if(v[j]<v[i])
                    {
                        temp=v[j];
                        v[j]=v[i];
                        v[i]=temp;
                        break;
                    }
                }
            }
            if(v.length%2==0)
            {
                median=(v[(v.length/2)-1]+v[(v.length/2)])/2;
            }
            else
            {
                median=v[v.length/2];
            }
            return median;
        }
}
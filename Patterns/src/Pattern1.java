public class Pattern1 {
    public static void main(String[] args) {
        int n = 3;
        int m = n;
        //main outer loop
        for (int i = 1; i <= n; i++) {
            //2nd outer loop
            for (int j = n; j > 0; j--)
            {
                // inner loop
                for (int k = m; k > 0; k--)
                {
                    System.out.print(j + " ");
                }
                System.out.print("");
            }
            m--;
            System.out.print("$");
        }
    }
}

public class subsequence {
    public static void ss(String str,int indx,String newString)
    {
        if(indx==str.length())
        {
            System.out.println(newString);
            return;
        }
        char ch=str.charAt(indx);
        ss(str,indx+1,newString+ch);
        ss(str,indx+1,newString);
    }
    public static void main(String[] args)
    {
        String str="abc";
        ss(str,0,"");
    }
}

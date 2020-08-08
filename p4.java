class p4
{
    public static void main()
    {
        String s="BLUEJ";
        int len=s.length();int k=0;
        for(int i=len;i>=1;i--)
        {
            System.out.print(s.substring(0,i));
            System.out.println(s.substring(0,k));
            k++;
        }
    }
}
        
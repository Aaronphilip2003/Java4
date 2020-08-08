class p5
{
    public static void main()
    {
        String s="BLUEJ";
        int len=s.length();int k=0;
        for(int i=0;i<len;i++)
        {
            char ch=s.charAt(i);
            for(int j=0;j<=i;j++)
            {
            System.out.print(ch);
        }
        System.out.println();
     }
    }
}
        
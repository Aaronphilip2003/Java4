import java.io.*;
class Palindrome_array
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 10 numbers:");
        int a[]=new int[10];
        for(int i=0;i<10;i++)
        {
            a[i]=Integer.parseInt(br.readLine());
        }
        for(int i=0;i<10;i++)
        {
            int n=a[i];
            int rev=0;
            while(n>0)
            {
            int r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
       if(rev==a[i])
        System.out.println(a[i]);
    }
    }
}

            
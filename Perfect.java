import java.io.*;
class Perfect
{
    static int isPerfect(int a)
    {
        int s=0;
        for(int i=1;i<a;i++)
        {
            if(a%i==0)
            s+=i;
        }
        if(s==a)
        return 1;
        else 
        return 0;
    }
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number to check whether it is a perfect number or not");
        int a=Integer.parseInt(br.readLine());
        int ans=isPerfect(a);
        if (ans==1)
        System.out.println("PERFECT NUMBER");
        else 
        System.out.println("NOT PERFECT");
    }
}
        
        
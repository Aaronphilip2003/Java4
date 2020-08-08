import java.io.*;
class Palindrome101
{
    static boolean isPalindrome(int a)
    {
        int copy=a,rev=0;
        while(a>0)
        {
            int r=a%10;
            rev=rev*10+r;
            a=a/10;
        }
        if(copy==rev)
        return true;
        else 
        return false;
    }
     public static void main(String args[])throws IOException
   {
       BufferedReader aaron=new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Enter a number to check if it is a Palindrome or not ");
       int a=Integer.parseInt(aaron.readLine());
       boolean b=isPalindrome(a);
       if(b==true)
       System.out.println("Palindrome number");
       else
       System.out.println("NOT A PALINDOME NUMBER");
    }
}
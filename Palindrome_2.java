import java.io.*;
class Palindrome_2
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number");
        int a=Integer.parseInt(br.readLine());
        int rev=0,temp=a;
        while(a>0)
        {
            int r=a%10;
            rev=(rev*10)+r;
            a=a/10;
        }
        if(rev==temp)
        System.out.println(temp+" is a palindrome");
        else
        System.out.println(temp+" is not a palindrome");
    }
}
        
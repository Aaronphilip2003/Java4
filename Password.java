import java.io.*;
class Password
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string ");
        String pass=br.readLine();
        System.out.println("Enter a string ");
        String pass2=br.readLine();
        if(pass==pass2)
        System.out.println("YES YESS");
        else 
        System.out.println("NO NO");
    }
}
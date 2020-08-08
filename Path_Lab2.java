import java.io.*;
class Path_Lab2
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 'true' if Anti-Body A is present and 'false' if Anti-body A is not present");
        boolean a=Boolean.parseBoolean(br.readLine());
        System.out.println("Enter 'true' if Anti-Body B is present and 'false' if Anti-body B is not present");
        boolean b=Boolean.parseBoolean(br.readLine());
        if(a==true&&b==true)
        System.out.println("BLOOD GROUP: O ");
        else if(a==true&&b==false)
        System.out.println("BLOOD GROUP: A ");
        else if(a==false&&b==true)
        System.out.println("BLOOD GROUP: B ");
        else if(a==false&&b==false)
        System.out.println("BLOOD GROUP: AB ");
        else 
        System.out.println("Enter the correct option:");
    }
}
        
import java.io.*;
class Path_Lab
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter '0' if Anti-Body A is present and '1' if Anti-body A is not present");
        int a=Integer.parseInt(br.readLine());
        System.out.println("Enter '0' if Anti-Body B is present and '1' if Anti-body B is not present");
        int b=Integer.parseInt(br.readLine());
        if(a==0&&b==0)
        System.out.println("BLOOD GROUP: O ");
        else if(a==0&&b==1)
        System.out.println("BLOOD GROUP: A ");
        else if(a==1&&b==0)
        System.out.println("BLOOD GROUP: B ");
        else if(a==1&&b==1)
        System.out.println("BLOOD GROUP: AB ");
    }
}
        
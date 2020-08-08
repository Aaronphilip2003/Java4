import java.io.* ;
class Odd_Subscript
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 10 numbers");
        int a[]=new int[10];
        for(int i=0;i<a.length;i++)
        {
            a[i]=Integer.parseInt(br.readLine());
        }
        for(int i=0;i<a.length;i+=2)
        System.out.println(a[i]);
    }
}
        
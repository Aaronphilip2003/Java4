import java.io.*;
class Pos_neg
{
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 5 numbers");
        int a[]=new int[5];int pos=0;int neg=0;
        for(int i=0;i<5;i++)
        {
            a[i]=Integer.parseInt(br.readLine());
        }
        for(int i=0;i<5;i++)
        {
           int n=a[i];
           if(n>0)
           pos++;
       
          else
          {
           neg++;
        }
       }
        System.out.println(pos);
        System.out.println(neg);
    }
}
         
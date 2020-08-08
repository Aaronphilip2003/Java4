import java.io.*;
class Odd_Even
{
    public static void main(String args[])throws IOException
    {
        int es=0,el=0,ol=0,os=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 10 numbers");
        int a[]=new int[10];
        int e[]=new int[10];
        int o[]=new int[10];
        for(int i=0;i<10;i++)
        {
            a[i]=Integer.parseInt(br.readLine());
        }
        for(int i=0;i<10;i++)
        {
        if(a[i]%2==0)
        {
        e[el++]=a[i];
        es+=a[i];
        }
        else
        {
        o[ol++]=a[i];
        os+=a[i];
        }
        }  
        for(int i=0;i<el;i++)
        System.out.println("Even number:"+e[i]);
        System.err.println("Even sum: "+es);
        System.err.println("Even length: "+el);
        for(int i=0;i<ol;i++)
        System.out.println("Odd number:"+o[i]+" ");;
        System.err.println("Odd sum: "+os);
        System.err.println("Odd length: "+ol);
    }
}
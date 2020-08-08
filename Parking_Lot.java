import java.io.*;
class Parking_Lot
{
    int vno,hours;
    double bill;
    void input()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Vehicle Number:");
        vno=Integer.parseInt(br.readLine());
        System.out.println("Enter the number of hours parked:");
        hours=Integer.parseInt(br.readLine());
    }
    void cal()
    {
        if(hours<=1)
        bill=hours*3;
        else if(hours>1)
        bill=1*3+hours*1.50;
    }
    void display()
    {
        System.out.println("Vehicle Number:"+vno);
        System.out.println("Number of hours parked:"+hours);
        System.out.println("Bill:"+bill);
    }
    public static void main(String args[])throws IOException
    {
        Parking_Lot obj=new Parking_Lot();
        obj.input();
        obj.cal();
        obj.display();
    }
}
    

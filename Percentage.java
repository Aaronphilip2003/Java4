import java.io.*;
class Percentage
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your marks in English Literature");
        double lit=Double.parseDouble(br.readLine());
        System.out.println("Enter your marks in English Language");
        double lang=Double.parseDouble(br.readLine());
        double english=(lit+lang)/2;
        System.out.println("Your Average in English is:"+english);
        System.out.println();
        System.out.println("Enter your Marks in History");
        double hist=Double.parseDouble(br.readLine());
        System.out.println("Enter your Marks in Geography");
        double geog=Double.parseDouble(br.readLine());
        double sst=(hist+geog)/2;
        System.out.println("Your Average in Social Studies is:"+sst);
        System.out.println();
        System.out.println("Enter your marks in Biology");
        double bio=Double.parseDouble(br.readLine());
        System.out.println("Enter your marks in Physics");
        double phy=Double.parseDouble(br.readLine());
        System.out.println("Enter your marks in Chemistry");
        double chem=Double.parseDouble(br.readLine());
        double science=(bio+chem+phy)/3;
        System.out.println("Your Average in Science is:"+science);
        System.out.println();
        System.out.println("Enter your marks in Mathematics");
        double maths=Double.parseDouble(br.readLine());
        System.out.println("Enter your marks in Hindi");
        double hindi=Double.parseDouble(br.readLine());
        System.out.println("Enter your marks in Computer Applications");
        double comp=Double.parseDouble(br.readLine());
        System.out.println("Your total marks are :"+(english+sst+science+maths+hindi+comp));
        System.out.println("Your Percentage is :"+(((english+sst+science+maths+hindi+comp)/600.0)*100));
    }
}

        
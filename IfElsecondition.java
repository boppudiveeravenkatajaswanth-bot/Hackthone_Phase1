import java.util.*;
public class IfElsecondition
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the waste collected (kg): ");
        double wastecollectedinkg = sc.nextDouble();

        if(wastecollectedinkg >= 100)
        {
            System.out.println("Collection Target Achieved");
        }
        else  
        {
            System.out.println("More Waste Collection Required");
        }     
        sc.close();
    }
}
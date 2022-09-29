import java.util.Scanner;
public class CbseCalc {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Subject One Marks:");
        Float subOne = sc.nextFloat();
        System.out.println("Enter Subject Two Marks:");
        Float subTwo = sc.nextFloat();
        Float Sum = subOne + subTwo;
         System.out.println("Enter Subject One Total Marks:");
        Float totalMarksOne = sc.nextFloat();
        System.out.println("Enter Subject Two Total Marks:");
        Float totalMarksTwo = sc.nextFloat();
        Float SumTotal = totalMarksOne+totalMarksTwo;
        Float Perc = Sum/SumTotal*100;
        System.out.println(Perc);


    }
}

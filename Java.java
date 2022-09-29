import java.util.Scanner;
public class Java {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Subject One Marks:");
        Float subOne = sc.nextFloat();
        System.out.println("Enter Subject Two Marks:");
        Float subTwo = sc.nextFloat();
        Float Sum = subOne + subTwo;
        Float Perc = Sum/200*100;
        System.out.println(Perc);


    }
}

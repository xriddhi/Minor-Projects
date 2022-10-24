import java.util.Random;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
   //ROCK PAPER SCISSORS
    Scanner sc = new Scanner(System.in);
    Random ran = new Random();
    
    System.out.println("Lets Play Rock Paper Scissors!");
    System.out.println("Input A Number Between 1 to 3");
    System.out.println("1. Rock 2.Paper 3.Scissors");
    int uI = sc.nextInt();
    int cI = ran.nextInt(3);
    System.out.println("AI's input is:");
    System.out.println(cI);

    if(uI == cI){
      System.out.println("OOPS,Its a draw! :|");
    }else if(uI == 1 && cI==2 || uI==3 && cI == 2 ){
      System.out.println("You win :O");
    }else {
      System.out.println("You loose :(");
    }
    
    
    
    
    
  }
}

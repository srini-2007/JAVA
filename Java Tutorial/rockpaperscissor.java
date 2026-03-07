import java.util.Random;
import java.util.Scanner;

public class rockpaperscissor {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Random random=new Random();

        String[] choices={"rock","paper","scissors"};
        String playerchaoice;
        String computerchoice;
        String playAgain="yes";


       do {
           System.out.print("Enter your Choice:");
           playerchaoice=sc.nextLine().toLowerCase();
           if(!playerchaoice.equals("rock") && !playerchaoice.equals("scissors") && !playerchaoice.equals("paper")){
               System.out.println("Invalid choice");
               continue;
           }
           computerchoice=choices[random.nextInt(3)];
           System.out.println("Computer Choice:"+computerchoice);
           if(playerchaoice.equals(computerchoice)){
               System.out.println("It's a damn tie");
           } else if ((playerchaoice.equals("rock") && computerchoice.equals("scissors") )|| (playerchaoice.equals("paper") && computerchoice.equals("rock")) || (playerchaoice.equals("scissors") && computerchoice.equals("paper")) ) {
               System.out.println("you won!!");
           }
           else{
               System.out.println("You Lost!");
           }
           System.out.print("Play again(yes/no):");
           playAgain=sc.nextLine().toLowerCase();
       }while(playAgain.equals("yes"));
       System.out.println("See You Later😢 Bye!  ");


    }
}

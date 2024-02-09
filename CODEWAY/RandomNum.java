// Java program for Random number game
import java.util.*;
class RandomNum{
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         Random rand = new Random();
         int count = 0;
         int yourScore = 0;
         int sysScore = 0;
         char choice = 's';
         do{
         int ran = rand.nextInt(1,101);
         count++;       //To keep track of number of games played
         for(int i = 0;i < 3;i++){           // for loop to limit the chances to 3 times
         System.out.println("Enter your number in the range 1 to 100:");
         int gus = sc.nextInt();
         if(ran == gus){
            System.out.println("You won");
            yourScore++;
            break;
         }
         else if(ran > gus){   
            System.out.println("Your guess is low");
            sysScore++;
         }
         else{
            System.out.println("Your guess is high");
            sysScore++;
         }
         }
          System.out.println("Do you want to play again??\n if yes press \"y\" otherwise press \"q\"");
      choice = sc.next().charAt(0);
      if(choice == 'q'){              //if the player wants to quit
        System.out.println("****Game Over****");
        System.out.println("Number of games played:"+count);
        System.out.println("Your Score:"+yourScore);
        System.out.println("System Score:"+sysScore);
      }
      if(choice != 'y' && choice != 'q'){  //if the player wants to continue
        System.out.println("Invalid Choice!!!");
      }
       }while(choice == 'y');

    }
}
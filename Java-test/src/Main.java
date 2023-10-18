import javax.swing.*;
import java.util.Scanner;
import java.util.Random;
public class Main{
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
       Random random= new Random();
       int lower=1;
       int upper=100;
       int numberelements=random.nextInt(upper-lower+1)+lower;
       int trys=0;
       boolean hasguestcc=false;
       System.out.println("number game");
        System.out.println("i am thinking the number betwwen +"+lower +"and "+upper);
       while (!hasguestcc){
           System.out.println("enter your guess :");
           int userGuess=scanner.nextInt();
           trys++;
           if (userGuess<lower || userGuess>upper){
               System.out.println("you must guest between 0-100 !!! ");
               
           } else if (userGuess<numberelements) {
               System.out.println("Higher! Try again.");
               
           } else if (userGuess>numberelements) {
               System.out.println("Lower! Try again.");
               
           }else {
               hasguestcc  =true;
           }

       }

    }
}

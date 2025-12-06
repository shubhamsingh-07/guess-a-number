import java.util.Random;
import java.util.Scanner;

public class MiniProject5 {
    public static void main(String[] args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        //GUESSING A NUMBER GAME

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomnumber = random.nextInt(min , max + 1);   //MAX VALUE IS EXCLUSIVE
        System.out.print("GUESSING A NUMBER GAME\n");


        do{
            System.out.printf("Enter your number between %d-%d: " , min , max);
            guess = scanner.nextInt();
            attempts++;
            //IF ELSE STATEMENT
            if (guess > randomnumber){
                System.out.print("TOO HIGH VALUE OF GUESS\n");
            }
            else if(guess < randomnumber){
                System.out.print("TOO LOW VALUE OF GUESS\n");
            }
            else{
                System.out.printf("MATCHED!! the number is %d \n" , randomnumber);
            }
        }while(guess != (randomnumber));

        System.out.printf("Total Attempts: %d\n" , attempts);

        //DATA-BASED ON INTERNET SOURCES
        if (attempts <= 3){
            System.out.print("Excellent, You are among the top 3% of players\n");
        }
        else if (attempts == 4 || attempts == 5 || attempts == 6 || attempts == 7){
            System.out.print("Good, You are among the top 5% of players\n");
        }
        else{
            System.out.print("Well, Played");
        }
        scanner.close();
    }
}

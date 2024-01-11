import java.util.Scanner;
import java.util.Random;

class RandomNum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int crt = 0;

        System.out.println("***Rules***\n1. You have 5 chances to guess the number\n2. Correct answer will result in 5 points");

        play: while (true) {
            int randNum = rand.nextInt(10);
            System.out.println(randNum);//Real world implementation will not include this statement
            int n = 1; 

            while (n <= 5) {
                System.out.println("\nGuess the number (0-10)");
                int num = sc.nextInt();

                if (randNum == num) {
                    crt += 5;
                    System.out.println("You guessed it right");
                    break;
                } else if (n < 4) {
                    System.out.println("!!Oops, try again!");
                } else {
                    System.out.println("This is your last chance");
                }
                n++;
            }

            System.out.println("\nTotal score: " + crt);
            System.out.println("\nWant to play again? (Y/N)");
            char ch = sc.next().charAt(0); 

            if (ch == 'Y' || ch == 'y') {
                continue play;
            } else {
                System.exit(0);
            }
              sc.close();
        }
    }
}

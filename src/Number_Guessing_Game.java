//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Random;
import java.util.Scanner;
public class Task1_Number_Guessing_Game {
    public static void main(String[] args) {



                Scanner scanner = new Scanner(System.in);
                Random random = new Random();
                int maxTries = 5;
                int score = 0;
                boolean playAgain;

                do {
                    int randomnumber = random.nextInt(100) + 1;
                    int tries = 0;
                    boolean guessedCorrectly = false;

                    System.out.println("Guess the number (between 1 and 100)");
                    System.out.printf("Total you have %d attempts \n",maxTries);

                    while (tries < maxTries) {
                        System.out.print("Enter your guess: ");
                        int guess = scanner.nextInt();
                        tries++;

                        if (guess == randomnumber) {
                            System.out.println("You guessed the number correctly!!");
                            guessedCorrectly = true;
                            score++;
                            break;
                        } else if (guess < randomnumber) {
                            System.out.println("Too Low. Guess Again:");
                        } else {
                            System.out.println("Too High. Guess Again:");
                        }

                        System.out.println("Attempts left: " + (maxTries - tries));
                    }

                    if (!guessedCorrectly) {
                        System.out.println("You are out of Tries. The number was: " + randomnumber);
                    }

                    System.out.print("Do you want to play another round? (yes/no): ");
                    scanner.nextLine();
                    playAgain = scanner.nextLine().equalsIgnoreCase("yes");

                } while (playAgain);

                System.out.println("Game over! Your total score: " + score);
                scanner.close();
            }
        }


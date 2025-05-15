import java.io.*;
import java.security.DrbgParameters.Reseed;
import java.util.*;

public class GAME {
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";

    public static void main(String[] args) {
        System.out.println(YELLOW+ "WELCOME TO QUIZ GAME !"+ RESET);
        File file = new File("input.txt");
        try {
            Scanner scanner = new Scanner(file);
            Scanner input = new Scanner(System.in);
            int score = 0;

            System.out.println(GREEN
                    + "You'll be given 5 maths question , your gool is to answers all correctly, Write the letter corresponding to the correct"
                    + RESET);
            for (int i = 0; i < 5; i++) {
                String line;
                for (int j= 0; j<6 && scanner.hasNextLine(); j++ ){
                    line = scanner.nextLine();
                    System.out.println(line);
                }

                    System.out.print("Answers :");
                    char ans = input.next().charAt(0);
                    if (ans == 'A' + i ) {
                        System.out.println(GREEN + "Correct !" + RESET);
                        score++;
                    } else {
                        System.out.println(RED + "Wrong ." + RESET);
                    }
                    System.out.println("\n");
                
            }
            System.out.println(YELLOW + "Your total correct answers is : " + score + RESET);

        } catch (FileNotFoundException e) {
            System.out.println(RED + "Error." + RESET);
            e.printStackTrace();
        }
    }
}

import java.io.*;
import java.util.*;

public class dice {

    public static void main(String[] args){
        Random random = new Random();

        int rand = random.nextInt((6-0) +1 + 0);

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if(number == rand){
            System.out.println("Well guess !");
        }else {
            System.out.println("Wrong, the number was " + rand);
        }

    }
}
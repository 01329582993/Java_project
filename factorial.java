import java.util.*;
import java.io.*;

public class factorial {
public static void main(String[] args)    {
    Scanner scanner = new Scanner(System.in);

    int number = scanner.nextInt();
    int out = 1;
    while(number != 0){
        out = out * number;
        number --;
    }
    System.out.println(out);

}
}

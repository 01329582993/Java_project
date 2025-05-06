import java.io.*;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class sort {
    public static void main(String[] args){
        try{
            //int[] array;
            ArrayList<Integer> list = new ArrayList<>();
            int i =0;
            Scanner scanner = new Scanner(new  File("input.txt"));
            while(scanner.hasNextInt()){
                int digit = scanner.nextInt();
                list.add(digit);
                i++;
            }
            list.sort(null);
            
            list.add(0);
            int j =0;
            while(j <i ){
                System.out.println(list);
                j++;
            }

           



        }catch(FileNotFoundException e){
            System.out.println("File not found");
            e.printStackTrace();
        }
    }
}

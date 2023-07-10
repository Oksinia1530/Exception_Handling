package seminar_1;

import java.io.FileWriter;
import java.util.Scanner;

public class hw_01 {

    public static void Method1(int a, int b) // ??????? ?? 0
     {
        int result = a / b;
        System.out.println("Division result: " + result);
    
    }

    public static int[] Method2() {
        int[] arr = {1, 2, 3}; // ????? ?? ??????? ???????
        int min_length = 5;
        
    }

    public static void Method3(String[] args) {
        File logFile = new File("lo/g.txt"); // ???????????? ??? ?????
        FileWriter fileWriter = new FileWriter(logFile);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
    }
    
}

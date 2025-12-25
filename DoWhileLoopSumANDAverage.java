import java.util.Scanner;

public class DoWhileLoopSumANDAverage {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("ENTER 10 NUMBER OF KEYBOARD:");
        int n;
        int sum = 0;
        int i = 1;
        double average;

        do {
            n=s1.nextInt();
            sum +=n;
            i++;
        } while (i <= 10);

        average = sum / 10.0;

        System.out.println("Sum of numbers: " + sum);
        System.out.println("Average of numbers: " + average);
        s1.close();
        
    }

}

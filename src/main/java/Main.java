import java.util.*;
/**
 *
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){

        Main thing = new Main();
        
        int number = thing.getInputNumber();

        long start1 = System.currentTimeMillis();
        int sum = thing.sumOfNumbers(number);
        long end1 = System.currentTimeMillis();
        System.out.println("Elapsed Time = " + (end1 - start1) + "ms");

        long start2 = System.currentTimeMillis();
        int gauss = thing.gaussianSumOfNumbers(number);
        long end2 = System.currentTimeMillis();
        System.out.println("Elapsed Time = " + (end2 - start2) + "ms");
        
        System.out.println(sum);
        System.out.println(gauss);

        // The sumOfNumbers method is faster than the gaussianSumOfNumbers.
        // Test Inputs used: 900000000, 800000000, 700000000.
    }
    
    // do this one and the lab is complete. really.
    // return the sum of 0 to n... if n == 3, the result should be 6
    int sumOfNumbers(int n) {
        int sum = 0;
        for(int i = 0; i <= n; i++){
            sum += i;
        }
        return sum;
    }
    
    
    int getInputNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");

        // This method reads the number provided using keyboard
        int num = scan.nextInt();

        // Closing Scanner after the use
        scan.close();
        return num;
    }
    
    
    
    // for Extra Credit
    int gaussianSumOfNumbers(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = (i / 2) * ( i + 1 );
        }
        return sum;
    }

    // for Extra extra credit - compare the methods and show which one is faster
    // google "how to time some java code"
    // use "System.currentTimeMillis()" to ask the system what time it is.
}

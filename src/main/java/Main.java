/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;
public class Main {


    public static void main(String[] args){

        int number = getInputNumber();
        long loopStart = System.currentTimeMillis();
        int sum = sumOfNumbers(number);
        long loopEnd = System.currentTimeMillis();
        long gaussStart = System.currentTimeMillis();
        int sum2 = gaussianSumOfNumbers(number);
        long gaussEnd = System.currentTimeMillis();

        if((loopEnd - loopStart)>(gaussEnd - gaussStart))
        {
            System.out.println("Loop is faster");
        }else if ((loopEnd - loopStart)<(gaussEnd - gaussStart)) {
            System.out.println("Gauss is faster");
        }else
            System.out.println("They are equally fast");

        System.out.println(sum + " and " + sum2);

    }
    
    // do this one and the lab is complete. really.
    // return the sum of 0 to n... if n == 3, the result should be 6
    static int sumOfNumbers(int n) {
        int x = 0;
        for (int i = 0; i <= n; i++)
        {
            x = x + i;
            System.out.println(x);
        }
        return x;
    }
    
    
    static int getInputNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");

        // This method reads the number provided using keyboard
        int num = scan.nextInt();

        // Closing Scanner after the use
        scan.close();
        return num;
    }


    
    // for Extra Credit
    static int gaussianSumOfNumbers(int n) {
        int gauss = n*(n+1)/2;
        return gauss;
    }
   
    // for Extra extra credit - compare the methods and show which one is faster
    // google "how to time some java code"
    // use "System.currentTimeMillis()" to ask the system what time it is.
}

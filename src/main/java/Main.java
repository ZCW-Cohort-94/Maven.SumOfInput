/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        
        int number = getInputNumber(); //assigns input from getInputNumber method to int number
        
        int sum = sumOfNumbers(number); //assigns the value that sum returns in sumOfNumbers to int sum
        System.out.println(sum); //outputs the value of sum


    }
    
    // do this one and the lab is complete. really.
    // return the sum of 0 to n... if n == 3, the result should be 6
    static int sumOfNumbers(int number){
        int sum = 0;
        for (int i = 0; i <= number; i++) {
            sum += i;
            //System.out.println("sum is now " + sum);
        }
        return sum; //returns value of sum to System.out.println(sum)
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
    int gaussianSumOfNumbers(int n) {
        return 0;
    }
   
    // for Extra extra credit - compare the methods and show which one is faster
    // google "how to time some java code"
    // use "System.currentTimeMillis()" to ask the system what time it is.
}

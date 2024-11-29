/**
 * It reverses a postivie integer. e.g. 1234 is modified to 4321
 */
import java.util.Scanner;

public class reversNum {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a positive integer: ");
        int input = scan.nextInt();
  
        int result = reverse(input);
        System.out.println("The number " + input + " is reversed to: " + result);

    }
    
    public static int reverse(int input){

        int result = 0;

        while(input > 0){
            
            result = result * 10 + input % 10;
            input = input / 10;
        }

        return result;
    }

}
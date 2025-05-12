
import java.util.Scanner;

public class Q2JuneTest230146740 {

    public static void main(String[] args) {
        // Read in an integer between 1 and 5 only
        // Display a message describing the number in words.
        // Then calculate and display sum of all the numbers entered from 1 to the number entered by the user.

        Scanner kbd = new Scanner(System.in);
        
        int num;
        System.out.print("Enter any integer from 1 to 5: ");
        num = kbd.nextInt();
        
        while ((num < 1) || (num > 5)) {
            System.out.print("Must be from 1 to 5 only, please re-enter: ");
            
            num = kbd.nextInt();
        }

        switch (num) {
            case 1:
                System.out.println("You entered a ONE");
                break;
            case 2:
                System.out.println("You entered a TWO");
                break;
            case 3:
                System.out.println("You entered a THREE");
                break;
            case 4:
                System.out.println("You entered a FOUR");
                break;
            default:
                System.out.println("You entered a FIVE");
        }

        // Calculate sum 
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            
            sum += i;
        }
        System.out.println("The sum from 1 to your number is: " + sum);

        }

    }

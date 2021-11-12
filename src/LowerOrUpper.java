/*Program to find if entered character is lowercase(a to z) or uppercase(A to Z)*/
import java.util.Scanner;

public class LowerOrUpper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character");

        // Character enter by the user
        char enteredChar = sc.next().charAt(0);

        //Finding if entered character is alphabet using ASCII value
        if(enteredChar>=65 && enteredChar<=90){
            System.out.println("Entered character" + enteredChar + " is an upper case letter");
        }
        else if(enteredChar>=97 && enteredChar<=122){
            System.out.println("Entered character" + enteredChar + "is an lower case letter");
        }
        else{
            System.out.println("Entered character" + enteredChar + " is not an alphabet ");
        }

    }
}

import java.util.Scanner;
public class BirthMonth_Lab5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int birthMonth = 0;

        System.out.println("What is your birth month? ");
        birthMonth = in.nextInt();
        if (birthMonth <= 12) {
            System.out.println("Your birth month is " + birthMonth);
        }
            else if (birthMonth > 12) {
            System.out.println("You entered an incorrect month value: " + birthMonth);
        }
        }

    }


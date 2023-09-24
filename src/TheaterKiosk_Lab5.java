import java.util.Scanner;
public class TheaterKiosk_Lab5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age = 0;

        System.out.println("What is your age? ");
        age = in.nextInt();
        if (age >= 21) {
            System.out.println("You get a paper wrist band!");
        }

    }
}

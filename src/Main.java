import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double price = 0;
        double shipping = 0;
        double totalPrice = 0;

        System.out.println("What is the price of your item?");
        price = in.nextDouble();
        if (price < 100) {
            shipping = price * .02;
            totalPrice = price + shipping;
            System.out.println("The price of the shipping " + shipping + " plus the original price of " + price + " comes out to a total cost of " + totalPrice);
        }
            else if(price >=  100) {
            System.out.println("The total cost is " + price);
        }
        }

    }

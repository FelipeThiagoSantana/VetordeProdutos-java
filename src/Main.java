import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the quantity of products ");
        int n = scanner.nextInt();
        Product[] vect = new Product[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the product name ");
            String name = scanner.next();

            System.out.println("Enter the product price ");
            double price = scanner.nextDouble();
            vect[i] = new Product(name, price);
        }
        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += vect[i].getPrice();
        }
        double avg = sum / n;
        System.out.printf("Average price: %.2f%n", avg);

    }
}
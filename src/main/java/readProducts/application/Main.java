package readProducts.application;

import readProducts.entities.ImportedProduct;
import readProducts.entities.Product;
import readProducts.entities.UsedProduct;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Enter the number of products: ");
        int product = sc.nextInt();

        for (int i=1; i <= product; i++){
            System.out.println("Product " + "#" + i + " data");
            System.out.println("Comum, used or importes ? (c/u/i)");
            char response = sc.next().charAt(0);

            if (response == 'c') {
                System.out.println("Name: ");
                String name = sc.nextLine();
                System.out.println("Price: ");
                double price = sc.nextDouble();
                Product pd = new Product(name, price);
            }
            else if (response == 'i') {
                System.out.println("Name: ");
                String name = sc.nextLine();
                System.out.println("Price: ");
                double price = sc.nextDouble();
                System.out.println("Custom Fee: ");
                double custom = sc.nextDouble();
                Product pd = new ImportedProduct(name, price, custom);
            }
            else {
                System.out.println("Name: ");
                String name = sc.nextLine();
                System.out.println("Price: ");
                double price = sc.nextDouble();
                System.out.println("Manufacturedate (DD/MM/YYYY): ");
                Date date = Date.valueOf(sc.next());
                Product pd = new UsedProduct(name, price, date);
            }
            System.out.println("PRICES TAGS: ");
            Product prt = new Product();
            System.out.println(prt.PriceTag());
            prt = new ImportedProduct();
            System.out.println(prt.PriceTag());
            prt = new UsedProduct();
            System.out.println(prt.PriceTag());
        }
    }
}
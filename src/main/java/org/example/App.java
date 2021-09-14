package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner sc= new Scanner(System.in);
        String price_item1, price_item2, price_item3;
        String quant_item1, quant_item2, quant_item3;
        double price1, price2, price3;
        double quant1, quant2, quant3;
        double subtotal, tax, total;

        System.out.print("Enter the price of item 1: ");
        price_item1=sc.nextLine();
        System.out.print("Enter the quantity of item 1: ");
        quant_item1=sc.nextLine();
        System.out.print("Enter the price of item 2: ");
        price_item2=sc.nextLine();
        System.out.print("Enter the quantity of item 2: ");
        quant_item2=sc.nextLine();
        System.out.print("Enter the price of item 3: ");
        price_item3=sc.nextLine();
        System.out.print("Enter the quantity of item 3: ");
        quant_item3=sc.nextLine();

        price1= Integer.parseInt(price_item1);
        quant1= Integer.parseInt(quant_item1);
        price2= Integer.parseInt(price_item2);
        quant2= Integer.parseInt(quant_item2);
        price3= Integer.parseInt(price_item3);
        quant3= Integer.parseInt(quant_item3);

        subtotal=(price1*quant1)+(price2*quant2)+(price3*quant3);
        tax=subtotal*.055;
        total=tax+subtotal;

        System.out.printf("Subtotal: $%.2f\nTax: $%.2f\nTotal: $%.2f", subtotal, tax, total);

    }
}

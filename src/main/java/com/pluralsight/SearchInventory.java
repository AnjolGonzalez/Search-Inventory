package com.pluralsight;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SearchInventory {
    public static void main(String[] args) {
        ArrayList<Product> inventory = getInventory();

        Scanner scan = new Scanner(System.in);
        System.out.println("We carry the following inventory: ");

        for (int i = 0; i < inventory.size(); i++ ) {
            Product p = inventory.get(i);

            System.out.printf("id:%d %s - Price: $%.2f ",p.getId(),p.getName(), p.getPrice());
        }

    }
    public static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<Product>();
        inventory.add(new Product(64, "HD Camera", 520.46f));
        inventory.add(new Product(16, "Waters ", 2.50f));
        inventory.add(new Product(42, "PhoneCase ", 5.50f));
        inventory.add(new Product(58, "Balloon ", 1.00f));
        inventory.add(new Product(34, "Doritoes ", 1.85f));

        Collections.sort(inventory,(p1, p2) -> p1.getName().compareToIgnoreCase(p2.getName()));
        return inventory;
    }
}

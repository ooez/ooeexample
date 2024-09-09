package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressManagement {
    public static void main(String[] args) {

        List<Contact> contacts = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.print("Möchten Sie einen Kontakt anlegen? (j/n): ");
            String input = scanner.nextLine();

            if (!input.equalsIgnoreCase("j")) {
                break;
            }


            System.out.print("Vorname: ");
            String firstname = scanner.nextLine();

            System.out.print("Nachname: ");
            String lastname = scanner.nextLine();

            System.out.print("Email: ");
            String email = scanner.nextLine();

            System.out.print("Telefonnummer: ");
            String phone = scanner.nextLine();


            Contact contact = new Contact(firstname, lastname, email, phone);

            System.out.print("Straße: ");
            String street = scanner.nextLine();

            System.out.print("Stadt: ");
            String city = scanner.nextLine();

            System.out.print("Postleitzahl: ");
            int zipCode = scanner.nextInt();

            System.out.print("Land: ");
            String country = scanner.nextLine();

            Address address = new Address(street, city, zipCode, country);
            contact.setAddress(address);

            contacts.add(contact);
        }

        System.out.println("\nGespeicherte Kontakte:");
        for (Contact contact : contacts) {
            System.out.println("Name: " + contact.firstName + " " + contact.lastName);
            System.out.println("Email: " + contact.email);
            System.out.println("Telefon: " + contact.phone);
            System.out.println("Adresse: " + contact.address.street + ", " + contact.address.city +
                    ", " + contact.address.zipCode + ", " + contact.address.country);
            System.out.println("-------------------------------");
        }

        scanner.close();
    }
}

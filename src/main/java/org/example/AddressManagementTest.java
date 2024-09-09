package org.example;

public class AddressManagementTest {
    public static void main(String[] args) {
        Contact aContact = new Contact("Max", "Mustermann","sasafsfaslö", "sakfllö");
        Address anAddress = new Address("Favoritenstraße", "Wien", 1100, "Austria");

        aContact.setAddress(anAddress);

        aContact.print();

    }
}

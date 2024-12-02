package org.example;

import org.example.mobile.Contact;
import org.example.mobile.MobilePhone;
import org.example.models.Grocery;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Grocery grocery = new Grocery();
        grocery.startGrocery();

        MobilePhone mobilePhone = new MobilePhone("1231321", new ArrayList<>());
        mobilePhone.addNewContact(new Contact("İlyas", "321321321"));
        mobilePhone.printContacts();
    }
}

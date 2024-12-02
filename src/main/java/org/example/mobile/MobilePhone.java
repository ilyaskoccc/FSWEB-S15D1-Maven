package org.example.mobile;

import java.util.List;

public class MobilePhone {
    private String myNumber;
    private List<Contact> myContact;

    public MobilePhone(String myNumber, List<Contact> myContact) {
        this.myNumber = myNumber;
        this.myContact = myContact;
    }

    public boolean addNewContact(Contact contact) {
        if(contact == null || contact.getName() == null || contact.getPhoneNumber() == null) {
            return false;
        }

        if(findContact(contact.getName()) >= 0) {
            return false;
        }
        return this.myContact.add(contact);
    }

    public int findContact(Contact contact) {
        return this.myContact.indexOf(contact);
    }

    public int findContact(String name) {
        for(int i = 0; i < myContact.size(); i++) {
            Contact contact = myContact.get(i);
            if (contact.getName().equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int index = findContact(oldContact);
        if (index <= 0) {
            return false;
        }
        this.myContact.set(index, newContact);
        return true;
    }

    public boolean removeContact(Contact contact) {
        if (contact == null || findContact(contact) < 0) {
            return false;
        }
        return this.myContact.remove(contact);
    }

    public Contact queryContact(String contactName) {
        int contactIndex = findContact(contactName);
        if (contactIndex < 0) {
            return null;
        }
        return this.myContact.get(contactIndex);
    }

    public void printContacts() {
        for (int i = 0; i < myContact.size(); i++) {
            Contact contact = myContact.get(i);
            System.out.println((i+1) + ". " + contact.getName() + " -> " + contact.getPhoneNumber());
        }
    }

    public String getMyNumber() {
        return myNumber;
    }

    public List<Contact> getMyContacts() {
        return myContact;
    }
}

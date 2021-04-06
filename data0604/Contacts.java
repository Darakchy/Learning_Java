package data0604;

import java.util.*;

public class Contacts {
    public static void main(String[] args) {
        List<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Dolomanjy Gheorge", "069960931"));
        contacts.add(new Contact("Darakchy Marianna", "068170073"));
        contacts.add(new Contact("Maslinkov Iurii", "070545117"));
        contacts.add(new Contact("Darakchy Maxim", "069347321"));
        contacts.add(new Contact("Maslinkov Iurii", "060545117"));
        contacts.add(new Contact("Dolomanjy Eugenii", "068067680"));
        for (Contact s : contacts) {
            System.out.println(s);
        }
        System.out.println();
        System.out.println();
        contacts.sort(new ContactComparator());
        for (Contact s : contacts) {
            System.out.println(s);
        }
    }
}

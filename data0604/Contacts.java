package data0604;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Contacts {
    public static void main(String[] args) throws FileNotFoundException {
        List<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Dolomanjy Gheorge", "069960931"));
        contacts.add(new Contact("Darakchy Marianna", "068170073"));
        contacts.add(new Contact("Maslinkov Iurii", "070545117"));
        contacts.add(new Contact("Darakchy Maxim", "069347321"));
        contacts.add(new Contact("Maslinkov Iurii", "060545117"));
        contacts.add(new Contact("Dolomanjy Eugenii", "068067680"));
        contacts.sort(new ContactComparator());
        StringBuilder sb = new StringBuilder();
        for (Contact s : contacts) {
            sb.append(s);
            sb.append("\n");
        }
        String info = sb.toString();
        File toFile = new File("ContactList");
        PrintWriter pr = new PrintWriter(toFile);
        pr.println(info);
        pr.close();
    }
}

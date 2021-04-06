package data0604;

import java.util.Comparator;

public class ContactComparator implements Comparator<Contact> {

    @Override
    public int compare(Contact c1, Contact c2) {
        int res = c1.getName().compareTo(c2.getName());
        if (res != 0)
            return res;
        else
            return c1.getNumber().compareTo(c2.getNumber());
    }

}

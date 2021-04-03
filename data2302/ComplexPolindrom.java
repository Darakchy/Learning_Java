package data2302;

import java.util.*;

public class ComplexPolindrom {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        if (line.equals(new StringBuilder(line).reverse().toString())) {
            System.out.println(line);
        } else {
            String[] lineArr = line.split("");
            List<String> lineList = Arrays.asList(lineArr);
            Set<String> lineSet = new HashSet<>(lineList);
            for (String i : lineSet) {
                System.out.print(i);
            }
            lineList = new ArrayList<>(lineSet);
            for (int i = lineList.size() - 2; i >= 0; i--) {
                System.out.print(lineList.get(i));
            }
        }
    }
}

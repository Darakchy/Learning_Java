package data2302;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Pars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder line = new StringBuilder(new String());
        String[]lineAr = new String[]{};
        List<String> lineList = new ArrayList<>();
        in.useDelimiter("\n");
        while (in.hasNextLine()) {
            line.append(in.nextLine()).append(" ");
        }
        lineAr = line.toString().split(" ");
        System.out.println(line);
        System.out.println(Arrays.toString(lineAr));


    }
}

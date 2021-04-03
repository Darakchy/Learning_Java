package data2403;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        String line = "ydfcj;ivhhfxkt.u'i;vdcrsj";
        System.out.println(count(line));
    }

    static Map<Character, Integer> count(String line) {
        Map<Character, Integer> lineMap = new HashMap<>();
        for (char c : line.toCharArray()) {
            if (lineMap.containsKey(c)) {
                int v = lineMap.get(c);
                lineMap.put(c, v + 1);
            } else {
                lineMap.put(c, 1);
            }
        }
        return lineMap;
    }
}


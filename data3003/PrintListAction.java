package data3003;

import java.util.List;

public class PrintListAction implements ListAction{

    @Override
    public void process(List<Integer> list) {
        for (Integer i:list) {
            System.out.print(i + " ");
        }
    }
}

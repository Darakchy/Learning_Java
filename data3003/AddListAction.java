package data3003;

import java.util.List;

public class AddListAction implements ListAction {
    Integer n;
    Integer i;

    public AddListAction(Integer i, Integer n) {
        this.i = i;
        this.n = n;
    }

    public AddListAction(Integer n) {
        this.n = n;
    }

    @Override
    public void process(List<Integer> list) {
        if (i == null) {
            list.add(n);
        } else list.add(i, n);
    }
}

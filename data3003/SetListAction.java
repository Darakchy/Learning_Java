package data3003;

import java.util.List;

public class SetListAction implements ListAction{
    Integer i;
    Integer n;

    public SetListAction(Integer i, Integer n) {
        this.i = i;
        this.n = n;
    }

    @Override
    public void process(List<Integer> list) {
        list.set(i,n);
    }
}

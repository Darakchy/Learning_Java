package data3003;

import java.util.List;

public class RemoveListAction implements ListAction {
    Integer i;

    public RemoveListAction(Integer i) {
        this.i = i;
    }

    @Override
    public void process(List<Integer> list) {
        list.remove(i);
    }
}

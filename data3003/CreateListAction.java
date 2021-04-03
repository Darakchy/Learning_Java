package data3003;

import java.util.List;

public class CreateListAction implements ListAction {
    int n;

    public CreateListAction(int n) {
        this.n = n;
    }

    @Override
    public void process(List<Integer> list) {
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
    }
}

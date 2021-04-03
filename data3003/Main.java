package data3003;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ListAction> actions = new ArrayList<>();
        actions.add(new CreateListAction(30));
        actions.add(new AddListAction(12));
        actions.add(new AddListAction(17));
        actions.add(new AddListAction(3,15));
        actions.add(new RemoveListAction(4));
        actions.add(new SetListAction(12,34));
        actions.add(new PrintListAction());
        processActions(actions);
    }

    public static void processActions(List<ListAction> actions) {
        List<Integer> integers = new ArrayList<>();
        for (ListAction action : actions) {
            action.process(integers);
        }
    }
}

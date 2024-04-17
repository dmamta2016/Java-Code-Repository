
import java.util.LinkedList;

class TestQueue<DataType> {
    private final String num;
private LinkedList<DataType> items = new LinkedList<>();


public TestQueue(DataType num) { this.num = (String) num;
}
public void enqueue(DataType item) { items.addLast(item);
}
public DataType dequeue() { return items.removeLast();
}
}
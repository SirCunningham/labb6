package labb6.composite;

import java.util.*;

public class WidthIterator<Component> implements Iterator {

    private Component parent;
    private int size;
    private Queue<Component> q;

    public WidthIterator(Component parent) {
        this.parent = parent;
        q = new LinkedList<Component>();
        q.add(parent);
        q = createQueue(q);

    }

    public void remove() {
    }

    public Component next() {
        return q.poll();
    }

    private Queue createQueue(Queue<Component> q) {
        if (q.peek() instanceof Composite) {
            Composite comp = (Composite) q.peek();
            q = createQueue2(q, (LinkedList<Component>) comp.getChildren());
        }
        return q;
    }

    private Queue createQueue2(Queue<Component> q, LinkedList<Component> children) {
        for (Component child : children) {
            q.add(child);
        }
        //Spara barnen på samma rad i en lista
        LinkedList<Component> tempChildren = new LinkedList<Component>();
        for (Component child : children) {
            if (child instanceof Composite) {
                Composite comp = (Composite) child;
                tempChildren.addAll((LinkedList<Component>) comp.getChildren());
            }
        }
        return createQueue2(q, tempChildren);
    }

    public boolean hasNext() {
        return !(q.size() == 1 || q.size()==0);
    }
}

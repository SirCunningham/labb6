package labb6.composite;

import java.util.*;

public class BreadthIterator<Component> implements Iterator {

    private Queue<Component> q;

    public BreadthIterator(Component parent) {
        q = new LinkedList<Component>();
        q.add(parent);
        q = createQueue(q);
    }

    @Override
    public void remove() {
    }

    @Override
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
        if (tempChildren.size() == 0) {
            return q;
        }
        return createQueue2(q, tempChildren);
    }

    @Override
    public boolean hasNext() {
        return !(q.size() == 0);
    }
}
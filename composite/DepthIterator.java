package labb6.composite;

import java.util.*;

public class DepthIterator<Component> implements Iterator {

    private Queue<Component> q;

    public DepthIterator(Component parent) {
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
            if (child instanceof Composite) {
                Composite comp = (Composite) child;
                q = createQueue2(q, (LinkedList<Component>) comp.getChildren());
            }
        }
        return q;
    }

    @Override
    public boolean hasNext() {
        return !(q.size() == 0);
    }
}
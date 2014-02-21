package labb6;

import java.util.*;

public class DepthIterator<Component> implements Iterator {

    private LinkedList<Component> children;
    private int size;

    public DepthIterator (LinkedList<Component> arrayList) {
        this.children = children;
        this.size = children.size();
    }
    
    public void remove() {
    }

    public Component next() {
        if (children.size()==1) {
            if (children.getFirst() instanceof Composite) {
                Composite comp = (Composite) children.getFirst();
            }
        }
        return null;
    }

    public boolean hasNext() {
        return false;
    }

}

package labb6;

import java.util.*;

public class WidthIterator<Component> implements Iterator {

    private LinkedList<Component> arrayList;
    private int size;

    public WidthIterator(LinkedList<Component> arrayList) {
        this.arrayList = arrayList;
        this.size = arrayList.size();
    }

    public void remove() {
    }

    public Component next() {
        return null;
    }

    public boolean hasNext() {
        return false;
    }
}

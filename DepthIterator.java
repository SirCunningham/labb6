package labb6;

import java.util.*;

public class DepthIterator <Component> implements Iterable<Component> {

    private LinkedList<Component> arrayList;
    private int size;

    public DepthIterator (LinkedList<Component> arrayList) {
        this.arrayList = arrayList;
        this.size = arrayList.size();
    }

    public Iterator<Component> iterator() {
        Iterator<Component> it = new Iterator<Component>() {

            private int currentIndex = 0;

            public boolean hasNext() {
                return currentIndex < size && arrayList.get(currentIndex) != null;
            }

            public Component next() {
                return arrayList.get(currentIndex++);
            }

            public void remove() {
                // TODO Auto-generated method stub
            }
        };
        return it;
    }
}

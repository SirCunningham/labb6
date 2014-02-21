package labb6;

import java.util.*;

public class DepthIterator <Component> implements Iterator {

    private LinkedList<Component> arrayList;
    private int size;

    public DepthIterator (LinkedList<Component> arrayList) {
        this.arrayList = arrayList;
        this.size = arrayList.size();
    }
    
    public void remove() {
        
    }

}

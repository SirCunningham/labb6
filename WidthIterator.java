package labb6;
import java.util.Iterator;

public class WidthIterator<Component> implements Iterable<Component> {
    private Component[] arrayList;
    private int size;
    
    public WidthIterator(Component[] arrayList) {
        this.arrayList=arrayList;
        this.size = arrayList.length;
    }
    public Iterator<Component> iterator() {
        Iterator<Component> it = new Iterator<Component>() {
            private int currentIndex=0;
            
            public boolean hasNext() {
                return currentIndex < size && arrayList[currentIndex] != null;
            }
            public Component next() {
                return arrayList[currentIndex++];
            }
            public void remove() {
                // TODO Auto-generated method stub
            }
            
            
    };
        return it;
    }
}

package labb6.composite;

import java.util.*;

public abstract class Component implements Iterable<Component> {
    
    public abstract void add(Component component);
    
    public abstract void remove(Component component);
    
    public abstract LinkedList<Component> getChildren();
    
    public abstract double getWeight();
    
    public abstract WidthIterator createWidthIterator();
    
    public abstract DepthIterator createDepthIterator();
}

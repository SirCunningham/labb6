package labb6;

import java.util.*;

public abstract class Component implements Iterable<Component> {

    public abstract void add(Component component);

    public abstract void remove(Component component);

    public abstract Component getChild(int level);

    public abstract double getWeight();

    public abstract WidthIterator createWidthIterator();

    public abstract DepthIterator createDepthIterator();
}

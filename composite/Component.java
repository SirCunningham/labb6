 package labb6.composite;

import java.util.*;

public abstract class Component implements Iterable<Component>, Cloneable {

    public abstract void add(Component component);

    public abstract void remove(Component component);

    public abstract LinkedList<Component> getChildren();

    public abstract double getTotalWeight();

    public abstract BreadthIterator createBreadthIterator();

    public abstract DepthIterator createDepthIterator();
<<<<<<< HEAD
    
=======

>>>>>>> 1747ac8b439a4d75ecd6060d8539da975f8e6669
    @Override
    public abstract Component clone();

    public abstract double getWeight();

    public abstract String getName();
}

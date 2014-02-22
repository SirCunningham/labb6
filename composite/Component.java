package labb6.composite;

import java.util.*;

public abstract class Component implements Iterable<Component>, Cloneable {

    public abstract void add(Component component);

    public abstract void remove(Component component);

    public abstract LinkedList<Component> getChildren();

    public abstract double getTotalWeight();

    public abstract BreadthIterator createBreadthIterator();

    public abstract DepthIterator createDepthIterator();

    @Override
    public abstract Component clone();

    public abstract double getWeight();

    public abstract String getName();

    public abstract String getGender();
}
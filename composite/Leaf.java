package labb6.composite;

import java.util.*;

public class Leaf extends Component {

    private final String name;
    private final double weight;

    public Leaf(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public void add(Component component) {
    }

    @Override
    public void remove(Component component) {
    }

    @Override
    public LinkedList<Component> getChildren() {
        return null;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public double getTotalWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public Iterator<Component> iterator() {
        return null;
    }

    @Override
    public DepthIterator createDepthIterator() {
        return null;
    }

    @Override
    public BreadthIterator createBreadthIterator() {
        return null;
    }

    @Override
    public Component clone() {
        return new Leaf(name, weight);
    }
}
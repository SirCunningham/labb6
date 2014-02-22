package labb6.composite;

import java.util.*;

public class Leaf extends Component implements Cloneable {

    String name;
    String genus;
    double weight;

    public Leaf(String name, String genus, double weight) {
        this.name = name;
        this.genus = genus;
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
    public String toString() {
        return genus + " " + name + " ";
    }

    @Override
    public String getName() {
        return name;
    }
    
    public String getGenus() {
        return genus;
    }

    @Override
    public double getTotalWeight() {
        return weight;
    }

    @Override
    public double getWeight() {
        return weight;
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
        return new Leaf(name, genus, weight);
    }
}
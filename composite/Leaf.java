package labb6.composite;

import java.util.*;

public class Leaf extends Component implements Cloneable {

    private String name;
    private String gender;
    private double weight;

    public Leaf(String name, String gender, double weight) {
        this.name = name;
        this.gender = gender;
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
        return String.format("%s %s ", gender, name);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getGender() {
        return gender;
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
        return new Leaf(name, gender, weight);
    }
}
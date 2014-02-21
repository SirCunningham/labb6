package labb6.composite;

import java.util.*;

public class Leaf extends Component {

    String name;
    double weight;

    public Leaf(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public void add(Component component) {
    }

    public void remove(Component component) {
    }

    public LinkedList<Component> getChildren() {
        return null;
    }

    public String toString() {
        return "en " + name + " ";
    }

    public double getWeight() {
        return weight;
    }

    public Iterator<Component> iterator() {
        return null;
    }

    public DepthIterator createDepthIterator() {
        return null;
    }

    public WidthIterator createWidthIterator() {
        return null;
    }
}

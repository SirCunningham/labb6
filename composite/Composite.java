package labb6.composite;

import java.util.*;

public class Composite extends Component implements Cloneable {

    private String name;
    private double weight;
    private LinkedList<Component> components = new LinkedList<Component>();

    public Composite(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public void add(Component component) {
        components.add(component);
    }

    public void remove(Component component) {
        components.remove(component);
    }

    public LinkedList<Component> getChildren() {
        return components;
    }
    


    public String toString() {
        String str = "en " + name + ", som innehåller ";
        for (int i = 0; i < components.size(); i++) {
            if (i == components.size() - 1 && components.size() != 1) {
                str += "och ";
            }
            str += components.get(i).toString();
        }
        return str;
    }
    public double getWeight() {
        return weight;
    }
    public String getName() {
        return name;
    }

    public double getTotalWeight() {
        double size = weight;
        for (Component component : components) {
            size += component.getTotalWeight();
        }
        return size;
    }

    public Iterator<Component> iterator() {
        Iterator<Component> iter = createDepthIterator();
        //Iterator<Component> iter = createBreadthIterator();
        return iter;
    }

    public BreadthIterator createBreadthIterator() {
        return new BreadthIterator(this);
    }

    public DepthIterator createDepthIterator() {
        return new DepthIterator(this);
    }
    public Component clone() {
        Composite compositeClone = new Composite(name,weight);
        for (Component comp : components) {
            if (comp instanceof Composite) {
                Composite compCopy = (Composite) comp.clone();
                compositeClone.add(compCopy);
            } else {
                Leaf leafCopy = new Leaf(comp.getName(), comp.getTotalWeight());
                compositeClone.add(leafCopy);
            }
        }
        return compositeClone;
    }
}

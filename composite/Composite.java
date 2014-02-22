package labb6.composite;

import java.util.*;

public class Composite extends Component implements Cloneable {

    private String name;
    private String gender;
    private double weight;
    private LinkedList<Component> components = new LinkedList<Component>();

    public Composite(String name, String gender, double weight) {
        this.name = name;
        this.gender = gender;
        this.weight = weight;
    }

    @Override
    public void add(Component component) {
        components.add(component);
    }

    @Override
    public void remove(Component component) {
        components.remove(component);
    }

    @Override
    public LinkedList<Component> getChildren() {
        return components;
    }

    @Override
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

    @Override
    public double getWeight() {
        return weight;
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
        double size = weight;
        for (Component component : components) {
            size += component.getTotalWeight();
        }
        return size;
    }

    @Override
    public Iterator<Component> iterator() {
        Iterator<Component> iter = createDepthIterator();
        //Iterator<Component> iter = createBreadthIterator();
        return iter;
    }

    @Override
    public BreadthIterator createBreadthIterator() {
        return new BreadthIterator(this);
    }

    @Override
    public DepthIterator createDepthIterator() {
        return new DepthIterator(this);
    }

    @Override
    public Component clone() {
        Composite compositeClone = new Composite(name, gender, weight);
        for (Component comp : components) {
            if (comp instanceof Composite) {
                Composite compCopy = (Composite) comp.clone();
                compositeClone.add(compCopy);
            } else {
                Leaf leafCopy = new Leaf(comp.getName(), comp.getGender(),
                        comp.getTotalWeight());
                compositeClone.add(leafCopy);
            }
        }
        return compositeClone;
    }
}
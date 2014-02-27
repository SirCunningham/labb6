package labb6.composite;

import java.util.*;

public class Composite extends Component {

    private final String name;
    private final double weight;
    private final LinkedList<Component> components = new LinkedList<>();

    public Composite(String name, double weight) {
        this.name = name;
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
    public String getName() {
        return name;
    }
    
    @Override
    public double getWeight() {
        return weight;
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
    public String toString() {
        String str = String.format("%s, som innehåller ", name);
        String adder = ", men inget mer";
        for (int i = 0; i < components.size(); i++) {
            if (i > 0) {
                str += ", ";
            }
            if (i == components.size() - 1 && components.size() != 1) {
                str += "och ";
            }
            str += components.get(i).toString();
        }
        return str + adder;
    }

    @Override
    public Iterator<Component> iterator() {
        //Iterator<Component> iter = createDepthIterator();
        Iterator<Component> iter = createBreadthIterator();
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
        Composite compositeClone = new Composite(name, weight);
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

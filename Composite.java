package labb6;

import java.util.*;

public class Composite extends Component {

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

    public Component getChild(int level) {
        return components.get(level);
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
        double size = weight;
        for (Component component : components) {
            size += component.getWeight();
        }
        return size;
    }

    public Iterator<Component> iterator() {
        Iterator<Component> iter = components.iterator();
        return iter;
    }

    public WidthIterator createWidthIterator() {
        return new WidthIterator(components);
    }

    public DepthIterator createDepthIterator() {
        return new DepthIterator(components);
    }
}

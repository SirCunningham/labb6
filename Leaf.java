package labb6;

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

    public Component getChild(int level) {
        return null;
    }

    public String toString() {
        return "en " + name + " ";
    }
    public double getWeight() {
        return weight;
    }
}

//Läste inte igenom labben tillräckligt noga och såg inte att denna skulle vara en abstrakt klass och inte ett interface.
//Ändrar sen

package labb6;

public abstract class Component {

    public abstract void add(Component component);

    public abstract void remove(Component component);

    public abstract Component getChild(int level);

    public abstract double getWeight();
}

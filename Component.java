//Läste inte igenom labben tillräckligt noga och såg inte att denna skulle vara en abstrakt klass och inte ett interface.
//Ändrar sen

package labb6;

public interface Component {

    public void add(Component component);

    public void remove(Component component);

    public Component getChild(int level);

    public double getWeight();
}

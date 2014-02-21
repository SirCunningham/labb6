package labb6.composite;

public class CompositeDesignPatternMain {

    public static void main(String[] args) {
        Component hair = new Leaf("hårspänne", 1);
        Component toiletBag = new Composite("necessär", 1);
        Component bag = new Composite("påse", 1);
        Component soap = new Composite("tvål", 1);
        Component test = new Leaf("Test", 1);
        Component water = new Leaf("Water", 1);
        soap.add(water);
        bag.add(hair);
        toiletBag.add(bag);
        toiletBag.add(soap);
        toiletBag.add(test);
        System.out.println(toiletBag);
        System.out.println(toiletBag.getWeight());
        //WidthIterator iter = toiletBag.createWidthIterator();
        for (Component comp : toiletBag) {
            System.out.println(comp);
        }
    }
}

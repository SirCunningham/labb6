package labb6;

public class CompositeDesignPatternMain {

    public static void main(String[] args) {
        Component hair = new Leaf("hårspänne", 1);
        Component toiletBag = new Composite("necessär", 1);
        Component bag = new Composite("påse", 1);
        Component soap = new Leaf("tvål", 1);
        bag.add(hair);
        toiletBag.add(bag);
        toiletBag.add(soap);
        System.out.println(toiletBag);
        System.out.println(toiletBag.getWeight());
        //WidthIterator iter = toiletBag.createWidthIterator();
        for (Component comp : toiletBag) {
            System.out.println(comp);
        }
    }
}

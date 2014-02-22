package labb6.composite;

public class CompositeDesignPatternMain {

    public static void main(String[] args) {
        Component hair = new Leaf("hårspänne", "ett", 1);
        Component toiletBag = new Composite("necessär", "en", 1);
        Component bag = new Composite("påse", "en", 1);
        Component soap = new Composite("tvål", "en", 1);
        Component test = new Leaf("test", "ett", 1);
        Component water = new Leaf("vatten", "ett", 1);
        soap.add(water);
        bag.add(hair);
        toiletBag.add(bag);
        toiletBag.add(soap);
        toiletBag.add(test);

        Composite clo = (Composite) toiletBag.clone();
        System.out.println(clo.equals(toiletBag));
        System.out.println(toiletBag);
        System.out.println("------");
        System.out.println(clo);
        /*
        System.out.println(toiletBag);
        System.out.println(toiletBag.getTotalWeight());
        
        //WidthIterator iter = toiletBag.createWidthIterator();
        for (Component comp : toiletBag) {
            System.out.println(comp);
        }
         * 
         */
    }
}
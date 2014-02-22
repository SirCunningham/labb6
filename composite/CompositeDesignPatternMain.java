package labb6.composite;

public class CompositeDesignPatternMain {

    public static void main(String[] args) {
        Component hair = new Leaf("ett hårspänne", 1);
        Component toiletBag = new Composite("en necessär", 1);
        Component bag = new Composite("en påse", 1);
        Component soap = new Composite("en tvål", 1);
        Component test = new Leaf("ett test", 1);
        Component water = new Leaf("vatten", 1);
        soap.add(water);
        bag.add(hair);
        toiletBag.add(bag);
        toiletBag.add(soap);
        toiletBag.add(test);

        Composite clone = (Composite) toiletBag.clone();
        System.out.println(clone.equals(toiletBag));
        System.out.println(format(toiletBag.toString()));
        System.out.println("------");
        System.out.println(format(clone.toString()));
        /*
        System.out.println(toiletBag);
        System.out.println(toiletBag.getTotalWeight());
        
        //WidthIterator iter = toiletBag.createWidthIterator();
        for (Component comp : toiletBag) {
            System.out.println(comp);
        }
         */
    }

    public static String format(String str) {
        return str.substring(0, 1).toUpperCase()
                + str.substring(1, str.length() - 2) + ".";
    }
}
package labb6.composite;

public class CompositeDesignPatternMain {

    public static void main(String[] args) {
        Component travelBag = new Composite("en resväska", 2);
        Component bag = new Composite("en påse", 0.1);
        Component pencilBox = new Composite("ett pennskrin", 0.3);
        Component pants = new Leaf("en byxa", 0.4);
        Component schampoo = new Leaf("schampoo", 0.3);
        Component soap = new Leaf("en tvål", 0.3);
        Component toothBrush = new Leaf("en tandborste", 0.1);
        Component pencil = new Leaf("en penna", 0.05);
        Component eraser = new Leaf("ett suddigum", 0.1);
        Component lead = new Leaf("stift", 0.01);

        travelBag.add(bag);
        travelBag.add(pencilBox);
        travelBag.add(pants);
        bag.add(schampoo);
        bag.add(soap);
        bag.add(toothBrush);
        pencilBox.add(pencil);
        pencilBox.add(eraser);
        pencilBox.add(lead);
        System.out.println(format(travelBag));
        System.out.println("--------------");
        for (Component comp : travelBag) {
            System.out.println(comp);
        }
        System.out.println("------copy--------");
        Component travelBagCopy = travelBag.clone();
        System.out.println(travelBagCopy);
        for (Component comp : travelBag) {
            for (Component compCopy : travelBagCopy) {
                if (comp.equals(compCopy)) {
                    System.out.println("Felaktig kopiering");
                }
            }
        }
        
    }

    public static String format(Component comp) {
        String str = comp.toString();
        return str.substring(0, 1).toUpperCase()
                + str.substring(1, str.length() - 2) + ".";
    }
}

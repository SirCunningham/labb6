package labb6.factory;

public class HumanApp {

    public static void main(String[] args) {
        Human putte = Human.create("Putte", "D03", 25);
        System.out.println("getName() -> " + putte.getName());
        System.out.println("getAge() -> " + putte.getAge());
        System.out.println("toString() -> " + putte.toString());
        System.out.println(putte);
    }
}

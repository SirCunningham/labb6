package labb6.factory;

public abstract class Human implements Comparable<Human> {

    private int age;
    private String name;
    private static String[] nameArray = {"Albert", "Bertil", "Cecilia",
        "Dennis", "Emma", "Ferdninand", "Gunilla", "Hilbert", "Ivar", "Joakim",
        "Klara", "Lena", "Martin", "Niklas", "Olle", "Petra", "Quisling",
        "Robert", "Sandra", "Tove", "Ulla", "Viktor", "Willam", "Xavier",
        "Yngve", "Zack", "Åke", "Ängla", "Örjan"};

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Human(String name, int age) {
        this(age, name);
    }

    public Human() {
        this((int) (Math.random() * 100),
                nameArray[(int) (Math.random() * nameArray.length)]);
    }

    @Override
    public String toString() {
        return String.format("%s, ålder %d år", name, age);
    }

    @Override
    public int compareTo(Human hum) {
        return age - hum.getAge();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public static Human create(String name, String year, int age) {
        String type = year.substring(0, 1);
        int newYear = Integer.parseInt(year.substring(1));
        if ("F".equals(type)) {
            return new Fysiker(age, name, newYear);
        } else if ("D".equals(type)) {
            return new Datalog(age, name, newYear);
        } else {
            return new Human(age, name) {
            };
        }
    }
}
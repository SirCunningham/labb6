package labb6.factory;

public class HumanApp {

    public static void main(String[] args) {
        try {
            System.out.println(Human.create("Anna", "D11", 21));
            System.out.println(Human.create("Quisling", "F99", 33));
        } catch (Exception e) {
            System.err.println("Något gick tyvärr fel.");
            e.printStackTrace();
        }
        try {
            /**
            class Maskinare extends Human {

                private Maskinare(String name, int year, int age)
                        throws TooLateException, TooSoonException, TooYoungException {
                    super(name, year, age);
                }

                @Override
                public String toString() {
                    return String.format("%s, ålder %d år, började maskin %d",
                            getName(), getAge(), getYear());
                }
            }
            
            Human hum = new Maskinare("Putte", 2003, 28);
            **/
        } catch (Exception e) {
            System.err.println("Något gick tyvärr fel.");
            e.printStackTrace();
        }
    }
}
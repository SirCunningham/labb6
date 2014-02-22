package labb6.factory;

public class Datalog extends Human {

    private int year;

    public Datalog(int age, String name, int year) {
        super(age, name);
        if (year < 1932) {
            this.year = 1932;
        } else if (year > 2013) {
            this.year = 2013;
        } else {
            this.year = year;
        }
        if (age < 15 + 2013 - year) {
            setAge(15 + 2013 - year);
        }
    }

    public Datalog(String name, int age, int year) {
        this(age, name, year);
    }

    public Datalog() {
        year = (int) (Math.random() * (2013 - 1932) + 1932);
        if (getAge() < 15 + 2013 - year) {
            setAge((int) (Math.random() * (100 - (15 + 2013 - year))
                    + 15 + 2013 - year));
        }
    }

    @Override
    public String toString() {
        return String.format("%s, började data D%s", super.toString(),
                String.valueOf(year).substring(2, 4));
    }

    public int getYear() {
        return year;
    }

    public int compareTo(Datalog dat) {
        if (getAge() == dat.getAge()) {
            return year - dat.getYear();
        } else {
            return getAge() - dat.getAge();
        }
    }
}
package labb6.factory;

public abstract class Human implements Comparable<Human> {

    private String name;
    private int year;
    private int age;

    private Human(String name, int year, int age)
            throws TooLateException, TooSoonException, TooYoungException {
        this.name = name;
        if (year < 1932) {
            throw new TooLateException();
        } else if (year > 2014) {
            throw new TooSoonException();
        } else {
            this.year = year;
        }
        if (age < 15 + 2014 - year) {
            throw new TooYoungException();
        } else {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return String.format("%s, ålder %d år, började %d", name, age, year);
    }

    @Override
    public int compareTo(Human hum) {
        if (age == hum.getAge()) {
            return year - hum.getYear();
        } else {
            return age - hum.getAge();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static Human create(String name, String year, int age)
            throws TooLateException, TooSoonException, TooYoungException,
            UndefinedTypeException {

        class Fysiker extends Human {

            private Fysiker(String name, int year, int age)
                    throws TooLateException, TooSoonException, TooYoungException {
                super(name, year, age);
            }

            @Override
            public String toString() {
                return String.format("%s, ålder %d år, började fysik %d",
                        getName(), getAge(), getYear());
            }
        }

        class Datalog extends Human {

            private Datalog(String name, int year, int age)
                    throws TooLateException, TooSoonException, TooYoungException {
                super(name, year, age);
            }

            @Override
            public String toString() {
                return String.format("%s, ålder %d år, började data %d",
                        getName(), getAge(), getYear());
            }
        }

        String type = year.substring(0, 1);
        int fullYear = Integer.parseInt(year.substring(1));
        if (fullYear < 15) {
            fullYear += 2000;
        } else if (fullYear < 100) {
            fullYear += 1900;
        }
        
        //switch med string fungerar inte i java 1.6
        if (type.equals("F")) {
            return new Fysiker(name, fullYear, age);
        } else if (type.equals("D")) {
            return new Datalog(name, fullYear, age);
        } else {
            throw new UndefinedTypeException();
        }
    }
}
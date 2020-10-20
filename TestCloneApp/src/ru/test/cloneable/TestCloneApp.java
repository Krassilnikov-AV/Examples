package ru.test.cloneable;

/**
 * Способ клонирования объекта в Java 
 * - переопределение метода clone() и
 * реализация интерфейса Cloneable()
 *
 * @author Aleks
 */
public class TestCloneApp {

    static class Person implements Cloneable {

        String name;
        int age;
        Car car;

        Person(Car car, int age, String name) {
            this.car = car;
            this.age = age;
            this.name = name;
        }

        @Override
        public String toString() {
            return this.name + " {"
                    + "age=" + age
                    + ", car=" + car
                    + '}';
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }

    static class Car {

        public String color;

        Car(String color) {
            this.color = color;
        }

        @Override
        public String toString() {
            return "{"
                    + "color car='" + color + '\''
                    + '}';
        }
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Car car = new Car("Green");
        Person person = new Person(car, 25, "Mike");

        Person clone = (Person) person.clone();
        System.out.println(person);
        System.out.println(clone);
        clone.name = new String("Ivan");
        clone.car.color = "red";
        System.out.println(person);
        System.out.println(clone);
    }
}

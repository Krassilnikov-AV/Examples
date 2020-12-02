package example;

import java.util.*;

public class Main {

    private static ArrayList<Car> cars = new ArrayList();

    public static void main(String[] args) {

        Car car1 = new Car("BMV", 1961);
        Car car2 = new Car("Lambordgini", 1945);
        Car car3 = new Car("Opel", 2013);
        Car car4 = new Car("Nissan", 1990);
        Car car5 = new Car("Mercedes", 1985);
        Car car6 = new Car("Volga", 1999);
        Car car7 = new Car("Ford", 2015);
        Car car8 = new Car("Toyota", 1981);

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);
        cars.add(car8);

//        Collections.sort(cars);
        Collections.sort(cars, new CarYearComparator());
        print();

        System.out.println("Самое старое авто: " + cars.get(0).getName());
int anzahl = cars.size();
int nou = anzahl-1;
        System.out.println("Самое новое авто: "+ cars.get(nou).getName());
        System.out.println("численость автопарка: " + anzahl);

        
}

    public static void print() {
        System.out.println();
        Iterator<Car> iterator = cars.iterator();

        while(iterator.hasNext()) {
            Car car = iterator.next();
            System.out.println(car.getName()+", "+ car.getYear());
        }

        }
    }
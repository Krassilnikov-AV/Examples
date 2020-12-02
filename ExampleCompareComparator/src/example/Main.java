package example;

import java.util.*;
import java.util.stream.*;

public class Main {

	private static List<Car> cars = new ArrayList();

	public static void main(String[] args) {

		cars = Stream.of(new Car("BMV", 1961),
			new Car("Lambordgini", 1945),
			new Car("Opel", 2013),
			new Car("Nissan", 1990),
			new Car("Mercedes", 1985),
			new Car("Volga", 1999),
			new Car("Ford", 2015),
			new Car("Toyota", 1981)).collect(Collectors.toList());

//        Collections.sort(cars);
		//Collections.sort(cars, new CarYearComparator());
		print();
		cars.stream().sorted( new CarYearComparator()).forEach(car->{
			System.out.println(car.getName() + " " + car.getYear());
		});
//		System.out.println("Самое старое авто: " + cars.get(0).getName());
//		int anzahl = cars.size();
//		int nou = anzahl - 1;
//		System.out.println("Самое новое авто: " + cars.get(nou).getName());
//		System.out.println("численость автопарка: " + anzahl);


	}

	public static void print() {
		System.out.println();
		Iterator<Car> iterator = cars.iterator();

		while (iterator.hasNext()) {
			Car car = iterator.next();
			System.out.println(car.getName() + ", " + car.getYear());
		}

	}
}
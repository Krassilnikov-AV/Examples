/*
 * Copyright (c) 2020 Tander, All Rights Reserved.
 */

package example;

import java.util.Comparator;

/**
 * Класс CarNameComparator
 */
   public class CarNameComparator implements Comparator<Car> {


	@Override
	public int compare(Car car1, Car car2) {
		return car1.getName().compareTo(car2.getName());
	}
}
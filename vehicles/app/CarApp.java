package com.vehicles.app;

import com.vehicles.parts.Engine;
import com.vehicles.Car;
public class CarApp {

	public static void main(String [] args) {
		Engine engine1 =new Engine();
		engine1.setEngineType("2 stroke");
		engine1.setHorsepower(1200);
		
		Car car =new Car();
		car.setBrand("lambo ");
		car.setModel("12E");
		car.setPrice(120000000);
		
		engine1.showEngineDetails();
		System.out.println();
		car.showCarDetails();
	}
}

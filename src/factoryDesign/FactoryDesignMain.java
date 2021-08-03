package factoryDesign;

import factoryDesign.factory.Car;
import factoryDesign.factory.CarFactory;

public class FactoryDesignMain {
	public static void main(String args[]) {
		CarFactory carfactory = new CarFactory(); 
		Car benz = carfactory.getCar("Benz");
		benz.Brand();
	}
}

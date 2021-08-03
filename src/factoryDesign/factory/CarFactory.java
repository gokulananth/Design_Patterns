package factoryDesign.factory;

public class CarFactory {
	public Car getCar(String car) {
		if (car == null) {
			return null;
		} else if (car.equals("Volvo")) {
			return new Volvo();
		} else if (car.equals("Benz")) {
			return new Benz();
		}
		return null;
	}
}

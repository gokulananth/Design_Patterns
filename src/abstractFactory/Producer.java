package abstractFactory;

public class Producer {
	public static MainFactory getUnit(String unit) {
		if(unit.equals("shape")) {
			return new ShapeFactory();
		}else if(unit.equals("color")) {
			return new ColorFactory();
		}
		return null;
	}
}

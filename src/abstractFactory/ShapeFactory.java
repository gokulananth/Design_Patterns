package abstractFactory;

public class ShapeFactory extends MainFactory{
	public  Shape getShape(String shape) {
		if(shape==null) {
			return null;
		}
		if(shape.equals("circle")) {
			return new Circle();
		}
		else if(shape.equals("Triangle")) {
			return new Triangle();
		}
		return null;
	}
	public Color getColor(String color) {
		return null;
	}
}

package abstractFactory;

public class ColorFactory extends MainFactory{
	public Shape getShape(String shape) {
		return null;
	}
	public Color getColor(String color) {
		if(color==null) {
			return null;
		}
		if(color.equals("green")) {
			return new Green();
		}
		else if(color.equals("blue")) {
			return new Blue();
		}
		return null;
	}
	
}


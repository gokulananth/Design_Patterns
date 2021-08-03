package abstractFactory;

public abstract class MainFactory {
	abstract public Shape getShape(String shape);
	abstract public Color getColor(String color);
}

package abstractFactory;

public class Working {
	public static void main(String args[]) {
		MainFactory shapefactory = Producer.getUnit("shape");
		Color shape1= ColorFactory.getColor("green");
		shape1.fill();
	}
}

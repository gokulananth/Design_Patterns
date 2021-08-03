package builder;

public class Shop {
	public static void main(String... args) {
		Computer com = new ComputerBuilder().setCpu("intel i5").setRam(16).getComputer();
		System.out.print(com);
	}
}

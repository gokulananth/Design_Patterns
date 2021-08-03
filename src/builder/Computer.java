package builder;

public class Computer {
	private String os;
	private int ram;
	private String cpu;
	private String gpu;
	
	public Computer(String os, int ram, String cpu, String gpu) {
		this.os = os;
		this.ram = ram;
		this.cpu = cpu;
		this.gpu = gpu;
	}

	@Override
	public String toString() {
		return "Computer [os=" + os + ", ram=" + ram + ", cpu=" + cpu + ", gpu=" + gpu + "]";
	}
}

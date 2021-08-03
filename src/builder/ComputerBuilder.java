package builder;

public class ComputerBuilder {
	private String os;
	private int ram;
	private String cpu;
	private String gpu;
	
	public ComputerBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	public ComputerBuilder setRam(int ram) {
		this.ram = ram;
		return this;
	}
	public ComputerBuilder setCpu(String cpu) {
		this.cpu = cpu;
		return this;
	}
	public ComputerBuilder setGpu(String gpu) {
		this.gpu = gpu;
		return this;
	}
	public Computer getComputer() {
		return new Computer(os,ram,cpu,gpu);
	}
}

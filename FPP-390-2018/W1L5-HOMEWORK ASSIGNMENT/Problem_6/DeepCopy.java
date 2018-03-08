package Problem_6;

class Computer implements Cloneable {
	private String manufacturer;
	private String processor;
	private int ramSize;
	private int diskSize;
	private double processorSpeed;

	public Computer(String manufacturer, String processor, int ramSize, int diskSize, double processorSpeed) {
		super();

		this.manufacturer = manufacturer;
		this.processor = processor;
		this.ramSize = ramSize;
		this.diskSize = diskSize;

		this.processorSpeed = processorSpeed;

	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;

	}

	public int getRamSize() {
		return ramSize;

	}

	public int getDiskSize() {
		return diskSize;

	}

	public double getProcessorSpeed() {
		return processorSpeed;

	}

	public double computePower() {

		double res = this.getRamSize() * this.getProcessorSpeed();
		return res;

	}

	@Override

	public String toString() {

		return " Manufacturer=" + manufacturer + ", Processor=" + processor + ", RamSize=" + ramSize

				+ ", DiskSize=" + diskSize + ", ProcessorSpeed=" + processorSpeed + ", ComputePower=" + computePower()

				+ "]";

	}

	protected Object clone() throws CloneNotSupportedException {
		Computer clone = (Computer) super.clone();
		return clone;

	}

}

class Person implements Cloneable {
	String name;
	Computer computer;

	public Person(String name, Computer computer) {
		super();

		this.name = name;
		this.computer = computer;
	}
	//Overriding clone() method to create a deep copy of an object.
	protected Object clone() throws CloneNotSupportedException {
		Person clone = (Person) super.clone();
		clone.computer = (Computer) this.computer.clone();

		return clone;
	}

	@Override

	public String toString() {

		return "Person [Name=" + name + ", Computer=" + computer + "]";

	}

}

public class DeepCopy {

	public static void main(String[] args) throws CloneNotSupportedException { 																	
		Computer c1 = new Computer("Apple", "Intel Core I7", 8, 500, 2.30);
		Person p1 = new Person("Thomas", c1);

		System.out.println(p1);

		System.out.println();
		System.out.println("CLONE() P1");
		Person p2 = (Person) p1.clone();
		System.out.println("Copy : " + p2);

		System.out.println("CHANGE MANUFACTURER IN P1");
		p1.computer.setManufacturer("ACER");

		System.out.println();

		System.out.println("Original : " + p1);

		System.out.println("Copy : " + p2);

	}

}
/*Output
Person [Name=Thomas, Computer= Manufacturer=Apple, Processor=Intel Core I7, RamSize=8, DiskSize=500, ProcessorSpeed=2.3, ComputePower=18.4]]

CLONE() P1
Copy : Person [Name=Thomas, Computer= Manufacturer=Apple, Processor=Intel Core I7, RamSize=8, DiskSize=500, ProcessorSpeed=2.3, ComputePower=18.4]]
CHANGE MANUFACTURER IN P1

Original : Person [Name=Thomas, Computer= Manufacturer=ACER, Processor=Intel Core I7, RamSize=8, DiskSize=500, ProcessorSpeed=2.3, ComputePower=18.4]]
Copy : Person [Name=Thomas, Computer= Manufacturer=Apple, Processor=Intel Core I7, RamSize=8, DiskSize=500, ProcessorSpeed=2.3, ComputePower=18.4]]

*/
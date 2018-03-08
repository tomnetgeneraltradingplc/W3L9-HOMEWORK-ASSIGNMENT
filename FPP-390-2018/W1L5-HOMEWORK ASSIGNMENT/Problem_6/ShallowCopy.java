package Problem_6;

class Personn implements Cloneable {
	String name;
	Computer computer;

	public Personn(String name, Computer computer) {
		super();

		this.name = name;
		this.computer = computer;
	}

	protected Object clone() throws CloneNotSupportedException {
		Personn clone = (Personn) super.clone();

		return clone;

	}

	@Override

	public String toString() {

		return "Person [Name=" + name + ", Computer=" + computer + "]";

	}

}

public class ShallowCopy {

	public static void main(String[] args) throws CloneNotSupportedException {
		Computer c1 = new Computer("Apple", "Intel Core I5", 12, 500, 2.30);
		Personn p1 = new Personn("Thomas", c1);

		System.out.println(p1);

		System.out.println();
		System.out.println("CLONE() P1");
		Personn p2 = (Personn) p1.clone();
		System.out.println("Copy : " + p2);

		System.out.println("CHANGE MANUFACTURER IN P1");
		p1.computer.setManufacturer("DELL");
		System.out.println();

		System.out.println("Original : " + p1);

		System.out.println("Copy : " + p2);

	}

}
/*Output
Person [Name=Thomas, Computer= Manufacturer=Apple, Processor=Intel Core I5, RamSize=12, DiskSize=500, ProcessorSpeed=2.3, ComputePower=27.599999999999998]]

CLONE() P1
Copy : Person [Name=Thomas, Computer= Manufacturer=Apple, Processor=Intel Core I5, RamSize=12, DiskSize=500, ProcessorSpeed=2.3, ComputePower=27.599999999999998]]
CHANGE MANUFACTURER IN P1

Original : Person [Name=Thomas, Computer= Manufacturer=DELL, Processor=Intel Core I5, RamSize=12, DiskSize=500, ProcessorSpeed=2.3, ComputePower=27.599999999999998]]
Copy : Person [Name=Thomas, Computer= Manufacturer=DELL, Processor=Intel Core I5, RamSize=12, DiskSize=500, ProcessorSpeed=2.3, ComputePower=27.599999999999998]]

*/
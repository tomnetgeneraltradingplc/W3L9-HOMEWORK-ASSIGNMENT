package Problem_5;

public class Computer {
private String manufacturer;
private String processor;
private int ramSize;
private int diskSize;
private double processorSpeed;
public Computer(String manufacturer, String processor, int ramSize, int diskSize, double processorSpeed) {
	this.manufacturer = manufacturer;
	this.processor = processor;
	this.ramSize = ramSize;
	this.diskSize = diskSize;
	this.processorSpeed = processorSpeed;
}
public int getRamSize(){
	return ramSize; 
}
public int getDiskSize(){
	return diskSize;
}
public double getProcessorSpeed(){
	return processorSpeed;
}
public double computePower(){
	return this.ramSize * this.processorSpeed;
}
public String toString(){
	return "[Manufacturer= " + manufacturer + ", Processor= " + processor + ", RAM Size= " + ramSize + ", Disk Size= " + diskSize + ", Processor Speed= " + processorSpeed +"]";
}
public boolean equals(Object obj){
	if(obj==null) return false;
	if((this.getClass()!=obj.getClass())) return false;
	Computer c = (Computer) obj;
	return (this.manufacturer.equals(c.manufacturer) && this.processor.equals(c.processor) && this.ramSize==c.ramSize && this.diskSize==c.diskSize && this.processorSpeed==c.processorSpeed);
}
public int hasCode(){
	int hash=5;
	long a = Double.doubleToLongBits(processorSpeed);
	hash = 7 * hash + manufacturer.hashCode() + processor.hashCode();
	hash = 11 * hash + (ramSize * diskSize);
	hash = 3 * hash + (int) (int) (a ^ (a >>> 32));
	return hash;
}
}

package Problem_5;

public class ComputerTest {

	public static void main(String[] args) {
Computer c1 = new Computer("Apple", "Intel Core i7", 12, 500, 2.6);
Computer c2 = new Computer("Hp", "AMD Core i5", 12, 1000, 2.0);
Computer c3 = new Computer("Apple", "Intel Core i7", 12, 500, 2.6);
System.out.println("Computer lists");
System.out.println("====================================");
Computer[] list = new Computer[3];
list[0]=c1;
list[1]=c2;
list[2]=c3;
for(Computer c:list){
	System.out.println(c);
}
System.out.println("\nhashCode of Computers");
System.out.println("==================================================");
System.out.println("C1 hashCode: " + c1.hasCode());
System.out.println("C2 hashCode: " + c2.hasCode());
System.out.println("C3 hashCode: " + c3.hasCode());
System.out.println("\nEqual methods of Computers");
System.out.println("==================================================");
System.out.println("C1 and C2 are equal: " + c1.equals(c2));
System.out.println("C1 and C3 are equal: " + c1.equals(c3));
System.out.println("C2 and C3 are equal: " + c2.equals(c3));
	}

}
/*Output
Computer lists
====================================
[Manufacturer= Apple, Processor= Intel Core i7, RAM Size= 12, Disk Size= 500, Processor Speed= 2.6]
[Manufacturer= Hp, Processor= AMD Core i5, RAM Size= 12, Disk Size= 1000, Processor Speed= 2.0]
[Manufacturer= Apple, Processor= Intel Core i7, RAM Size= 12, Disk Size= 500, Processor Speed= 2.6]

hashCode of Computers
==================================================
C1 hashCode: 1195279731
C2 hashCode: -703045040
C3 hashCode: 1195279731

Equal methods of Computers
==================================================
C1 and C2 are equal: false
C1 and C3 are equal: true
C2 and C3 are equal: false
*/
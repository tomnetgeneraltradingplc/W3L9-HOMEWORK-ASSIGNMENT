package Day2_Problem_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Main {
	
	 public static List<Marketing> listMoreThan1000(List<Marketing> list) {
		 List<Marketing> temp = new ArrayList();
		 for (Marketing marketing : list) {
		 if (marketing.getSalesamount() >= 1000) {
		 temp.add(marketing);
		 }
		 }
		 return temp;
		 }

	 public static void main(String[] args) {
	 ArrayList<Marketing> list = new ArrayList();
	 list.add(new Marketing("Thomas", "Sony", 50000));
	 list.add(new Marketing("Anne", "Samsung phone", 2000));
	 list.add(new Marketing("Juli", "IPod", 500));
	 list.add(new Marketing("Smith", "Laptop", 2500));
	 list.add(new Marketing("Smith", "Laptop", 2700));
	 list.add(new Marketing("Jo", "MacBook", 9000));
	 System.out.println("Marketing List");
	 System.out.println(list);
	 System.out.println("---------------------------------\n");
	 list.remove(list.get(2));
	 System.out.println("After remove");
	 System.out.println(list);
	 System.out.println("---------------------------------\n");
	 list.get(1).setProductname("Iphone 8");
	 System.out.println("Size : " +list.size() );
	 System.out.println("---------------------------------\n");
	 System.out.println("Order by Sales Amount");
	 Collections.sort(list, new SalesComparator());
	 System.out.println(list);
	 System.out.println("---------------------------------\n");
	 System.out.println("Order by Name and listMoreThan1000 ");
	  List<Marketing> list1 = listMoreThan1000(list);
	 Collections.sort(list1, new NameComparator());
	 System.out.println(list1);
	 System.out.println("---------------------------------\n");
	 }
	}
/*Output
Marketing List
[Thomas Sony 50000.0, Anne Samsung phone 2000.0, Juli IPod 500.0, Smith Laptop 2500.0, Smith Laptop 2700.0, Jo MacBook 9000.0]
---------------------------------

After remove
[Thomas Sony 50000.0, Anne Samsung phone 2000.0, Smith Laptop 2500.0, Smith Laptop 2700.0, Jo MacBook 9000.0]
---------------------------------

Size : 5
---------------------------------

Order by Sales Amount
[Anne Iphone 8 2000.0, Smith Laptop 2500.0, Smith Laptop 2700.0, Jo MacBook 9000.0, Thomas Sony 50000.0]
---------------------------------

Order by Name and listMoreThan1000 
[Anne Iphone 8 2000.0, Jo MacBook 9000.0, Smith Laptop 2500.0, Smith Laptop 2700.0, Thomas Sony 50000.0]
---------------------------------

*/
package Day1_Problem_1;
import java.util.Arrays;
import java.util.Iterator;
public class MyStringList {
	private final int INITIAL_LENGTH = 4;
	private String[] strArray; 
	private int size;
	
	public MyStringList() {
		strArray = new String[INITIAL_LENGTH];
		size = 0;
	}
	
	public void add(String s){
		if(size == strArray.length) resize();
		strArray[size++] = s;
	}
	
	public String get(int i){
		if(i < 0 || i >= size){
			return null;
		}
		return strArray[i];
	}
	
	public boolean find(String s){
		for(String test : strArray){
			if(test.equals(s)) return true;
		}
		return false;
	}
	
	public void insert(String s, int pos){
		if(pos > size) return;
		if(pos >= strArray.length||size+1 > strArray.length) {
			resize();
		}
		String[] temp = new String[strArray.length+1];
		System.arraycopy(strArray,0,temp,0,pos);
		temp[pos] = s;
		
		System.arraycopy(strArray,pos,temp,pos+1, strArray.length - pos);
		strArray = temp;
		++size;
		
	}
	
	public boolean remove(String s){
		if(size == 0) return false;
		int index = -1;
		for(int i = 0; i < size; ++i ){
			if(strArray[i].equals(s)){
				index = i;
				break;
			}
		}
		if(index==-1) return false;
		String[] temp = new String[strArray.length];
		System.arraycopy(strArray,0,temp,0,index);
		System.arraycopy(strArray,index+1,temp,index,strArray.length-(index+1));
		strArray = temp;
		--size;
		return true;
	}
	//Sort
	public void sort(){
if(strArray == null || size<=1) return;
		
		int temp = 0;
		for(int i = 0; i < size; ++i){
			int nextMinPos = minpos(i,size-1);
			swap(i,nextMinPos); 
		}
	}
	//Swap
	public void swap(int i, int j){
		String temp = strArray[i];
		strArray[i] = strArray[j];
		strArray[j] = temp;
		
	}
	//find minimum of arr between the indices bottom and top
	public int minpos(int bottom, int top){		
		String min = strArray[bottom];
		int index = bottom;
		for(int i = bottom+1; i <= top; ++i){
			if(strArray[i].compareTo(min)<0){ 
				min = strArray[i];
				index = i;
			}
		}
		//return location of min, not the min itself
		return index;
	}
	//search sorted array
		boolean binSearch(String val) {
			boolean b = recurse(0,strArray.length-1, val);
			return b;
		}


		boolean recurse(int a, int b, String val) {
			int mid = (a+b)/2;
			if(strArray[mid].equals(val)) return true;
			if(a > b) return false;
			if(val.compareTo(strArray[mid])>0) 
				return recurse(mid+1, b, val);
			return recurse(a,mid-1,val);
		}
		//Helper method for iterator inteface 
		public Iterator iterator() {
			return new MyIterator();
		}
		private class MyIterator implements Iterator {

			private int position;
			MyIterator(){
				position = 0;
			}
			public boolean hasNext() {
				return (position < size);
			}

			public Object next() throws IndexOutOfBoundsException {
				if(!hasNext()) throw new IndexOutOfBoundsException();
				return strArray[position++];
			}
			public void reset() {
				position = 0;
			}
		}
	private void resize(){
		System.out.println("resizing");
		int len = strArray.length;
		int newlen = 2*len;
		String[] temp = new String[newlen];
		System.arraycopy(strArray,0,temp,0,len);
		strArray = temp;
	}
	public String toString(){
		StringBuilder sb = new StringBuilder("[");
		for(int i = 0; i < size-1; ++i){
			sb.append(strArray[i]+", ");
		}
		sb.append(strArray[size-1]+"]");
		
		return sb.toString();
	}
	public int size() {
		return size;
	}
		
	
		public static void main(String[] args) {
			String[] testArr = {"big", "small", "tall", "short", "round", "square", "enormous", "tiny","gargantuan", "lilliputian", "numberless", "none", "vast", "miniscule"};
			MyStringList list = new MyStringList();
			for(int i = 0; i < testArr.length; ++i) {
				list.add(testArr[i]);}
			System.out.println("The list Before in sorted order:");
			System.out.println(list.toString());
			System.out.println();
			
			list.sort();
			System.out.println("The list in sorted order:");
			System.out.println(list.toString());
			System.out.println();
			System.out.println("\"short\" is in the list? "+list.binSearch("short"));
			System.out.println("\"none\" is in the list? "+list.binSearch("none"));
			System.out.println("\"integer\" is in the list? "+list.binSearch("integer"));
			
}
}
/*Output
resizing
resizing
The list Before in sorted order:
[big, small, tall, short, round, square, enormous, tiny, gargantuan, lilliputian, numberless, none, vast, miniscule]

The list in sorted order:
[big, enormous, gargantuan, lilliputian, miniscule, none, numberless, round, short, small, square, tall, tiny, vast]

"short" is in the list? true
"none" is in the list? true
"integer" is in the list? false
*/
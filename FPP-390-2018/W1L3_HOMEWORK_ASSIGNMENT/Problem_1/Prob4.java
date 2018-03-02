package Problem_1;

public class Prob4 {
	static int count = 0;

	Prob4() {
		++count;
	}

	public int getCount() {
		return count;
	}

	public static void main(String[] args){
	Prob4 instance = null;
	for(int i = 0; i < 10; ++i){
	 instance = new Prob4();
	}
	System.out.println("Number of instances so far = "+instance.getCount());
	 }
}
package Problem_3;

public class FigureTest {

	public static void main(String[] args) {
		Figure[] fig = new Figure[5];
		fig[0] = new UpwardHat();
		fig[1] = new UpwardHat();
		fig[2] = new DownwardHat();
		fig[3] = new FaceMaker();
		fig[4] = new Vertical();

		for (Figure f : fig) {
			f.getFigure();
		}
		System.out.println();
		for (Figure f : fig) {
			System.out.println(f.getClass().getSimpleName() + ": ");
			f.getFigure();
			System.out.println();
		}

	}
}
/*Output
/\/\\/:)||
UpwardHat: 
/\
UpwardHat: 
/\
DownwardHat: 
\/
FaceMaker: 
:)
Vertical: 
||
*/
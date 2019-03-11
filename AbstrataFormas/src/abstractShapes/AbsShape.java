package abstractShapes;

public class AbsShape {

	public static void main(String[] args) {
		twoDShape shapes[] = new twoDShape[5];
		
		shapes[0] = new Triangle ("outlined", 8.0, 12.0);
		shapes[1] = new Rectangle (10);
		shapes[2] = new Rectangle (10, 4);
		shapes[3] = new Rectangle (7.0);
		shapes[4] = new Hexagon();
		
		for(int i=0; i < shapes.length; i++) {
			System.out.println("Object is "+ shapes[i].getName());
			System.out.println("Area is "+ shapes[i].area());
			shapes[i].showDim();
			System.out.println();
		}
	}
}

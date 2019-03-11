package abstractShapes;

public class Triangle extends twoDShape{
	
	private String style;

	Triangle() {
		super();
		style = "none";
	}
	
	Triangle(String S, double w, double h) {
		super(w,h,"triangle");
	}
	
	Triangle(double x){
		super(x,"triangle");
	}
	
	Triangle(Triangle ob) {
		super(ob);
		style = ob.style;
	}

	@Override
	double area() {
		return getWidth()*getHeigth()/2;
	}
	
	void showStyle() {
		System.out.println("Triangulo e "+ style);
	}
	
}

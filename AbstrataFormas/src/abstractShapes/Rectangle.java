package abstractShapes;

public class Rectangle extends twoDShape{

	Rectangle(){
		super();
	}
	
	Rectangle(double w, double h){
		super(w, h, "rectangle");
	}
	
	Rectangle(double x){
		super(x, "rectangle");
	}
	
	Rectangle(Rectangle ob){
		super(ob);
	}
	
	boolean isSquare() {
		if(getWidth() == getHeigth()) return true;
		return false;
	}
	
	double area() {
		return getWidth() * getHeigth();
	}
	
	
}

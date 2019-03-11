package abstractShapes;

public abstract class twoDShape {
	private double width;
	private double heigth;
	private String name;

	//construtor padrao
	twoDShape(){
		width = heigth = 0.0;
		name = "none";
	}
	
	//construtor com assinatura diferente
	twoDShape(double w, double h, String n){
		width = w;
		heigth = h;
		name = n;
	}
	
	//constroi objeto co largura e altura iguais 
	twoDShape(double x, String n){
		width = heigth = x;
		name = n;
	}
	//constroi obejeto a partir de outro{
	twoDShape(twoDShape ob){
		width = ob.width;
		heigth = ob.heigth;
		name = ob.name;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getHeigth() {
		return heigth;
	}
	
	public void setHeigth(double heigth) {
		this.heigth = heigth;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	void showDim() {
		System.out.println("Largura e altura sao "+ width + " e "+ heigth);
	}
	
	abstract double area();

	
}

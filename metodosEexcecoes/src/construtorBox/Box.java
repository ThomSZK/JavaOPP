package construtorBox;

public class Box {
	double width; 
	double heigth;
	double depth;
	
	Box(Box ob){
		width = ob.width;
		heigth = ob.heigth;
		depth = ob.depth;
	}
//	usado quando as dimensoes sao especificadas
	Box(double w, double h, double d) {
		width = w;
		heigth = h;
		depth = d;
	}
	
	Box() {
		width = -1;
		heigth = -1;
		depth = -1;
	}
	
	Box(double len) {
		width = heigth = depth = len;
	}
	
	double volume() {
		return width*heigth*depth;
	}

	public static void main(String[] args) {
		Box mybox1 = new Box(10, 20, 15);
		Box mybox2 = new Box();
		Box mybox3 = new Box(7);
		Box myclone = new Box(mybox1);
		
		double vol;
		
		vol=mybox1.volume();
		System.out.println("Volume da caixa 1: "+vol);
		vol=mybox2.volume();
		System.out.println("Volume da caixa 2: "+vol);
		vol=mybox3.volume();
		System.out.println("Volume da caixa 3: "+vol);
		vol=myclone.volume();
		System.out.println("Volume da caixa clone: "+vol);
	}

}

package despachoDinamico;


class Super{
	void who() {
		System.out.println("Who() in sub");
	}
}

class Sub1 extends Super{
	void who() {
		System.out.println("Who() in sub1");
	}
}

class Sub2 extends Super{
	void who() {
		System.out.println("Who() in sub2");
	}
	
}

public class DespachoDinamico {

	public static void main(String[] args) {
		Super superOb = new Super();
		Sub1 subOb1 = new Sub1();
		Sub2 subOb2 = new Sub2();
		
		Super superRef;
		
		superRef = superOb;
		superRef.who();
		
		superRef = subOb1;
		superRef.who();
		
		superRef = subOb2;
		superRef.who();
	}

}



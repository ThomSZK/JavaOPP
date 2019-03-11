package metodosEexcecoes;

public class Test {

	int a, b;
	
	
	Test(int i, int j) {
		a=i;
		b=j;
	}
	
//retorna true se for igual ao objeto invocado
	boolean equalTo(Test o) {
		if(o.a == a && o.b ==b)
			return true;
		else
			return false;
	}
}

package abistrato;

public abstract class Animal {

	private String especie;
	private String alimento;
	private int tamanho;
	private int peso;
	
	public abstract void fazBarulho();
	
	public Animal() {
		especie = "nenhuma";
		alimento = "indefinido";
		peso = 0;
		tamanho = 0;
		
	}
	
	public Animal (String e, String a, int t, int p) {
		especie = e;
		alimento = a;
		tamanho = t;
		peso = p;
	}
	
	public String getEspecie() {
		return especie;
	}
	
	public String getAlimento() {
		return alimento;
	}
	public void getTamanho() {
		System.out.println("Ele mede "+tamanho+" centimetros");
	}
	public void getPeso() {
		System.out.println(peso+" kilos");
	}

}

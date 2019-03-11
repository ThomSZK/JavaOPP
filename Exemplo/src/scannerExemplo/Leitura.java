package scannerExemplo;
import java.util.Scanner;
public class Leitura {

	public Leitura() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome:");
		
		String nome = sc.nextLine();
		
		System.out.println(nome);
		
		System.out.println("Digite dois valores inteiros:");
		
		int a = sc.nextInt();
		System.out.println(a);
		int b = sc.nextInt();
		System.out.println(b);
		
		System.out.println("Insira um modificador aritimetico:");
		
		int operador = sc.nextInt();
		
		System.out.println(operador);
		
		
		if (operador==1)
		{
			int c = (a+b);
			System.out.println(c);
		}
		if (operador==2)
		{
			int c = (a-b);
			System.out.println(c);
		}
		if (operador==3)
		{
			int c = (a*b);
			System.out.println(c);
		}
		
	}
		
		

}

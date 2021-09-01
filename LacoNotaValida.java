import java.util.Scanner;
public class LacoNotaValida {
	public static void main(String[]args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Insira uma nota de 0 a 10");
		double nota= scan.nextDouble();
		if (nota>=1 && nota<=10) {
			System.out.println("A nota inserida foi: "+ nota);
		}else {
			while (nota < 1 || nota>10) {
				System.out.println("Nota inválida. Insira um valor entre 1 e 10.");
				nota=scan.nextDouble();
			}
			System.out.println("A nota inserida foi: "+ nota);
		
		}
	}

}

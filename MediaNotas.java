import java.util.Scanner;
public class MediaNotas {
 public static void main(String [] args) {
	 Scanner nota= new Scanner(System.in);
	 System.out.println("Digite suas 4 notas.");
	 double nota1=nota.nextDouble();
	 double nota2=nota.nextDouble();
	 double nota3=nota.nextDouble();
	 double nota4=nota.nextDouble();
	 double media= (nota1+nota2+nota3+nota4)/4;
	 System.out.println("Sua média é: "+ media);
 }
}

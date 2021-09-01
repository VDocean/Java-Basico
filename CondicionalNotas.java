import java.util.Scanner;
public class CondicionalNotas {
 public static void main (String [] args) {
	 Scanner scan= new Scanner(System.in);
	 System.out.println("Digite suas quatro notas.");
	 double nota1=scan.nextDouble();
	 double nota2=scan.nextDouble();
	 double nota3=scan.nextDouble();
	 double nota4=scan.nextDouble();
	 double media=(nota1+nota2+nota3+nota4)/4;
	 System.out.println(media);
	 if (media >= 7) {
		 System.out.println("Aluno aprovado");
	 }else if (media <7) {
		 System.out.println("Aluno reprovado");
	 }else if (media==10){
		 System.out.print("Aluno aprovado com louvores");
		 
	 }
 }
}

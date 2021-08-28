import java.util.Scanner;
public class SalarioMensal {
 public static void main(String [] args) {
	 Scanner valores= new Scanner(System.in);
	 System.out.println("Digite quanto você ganha por hora no seu trabalho e quantas horas trabalha por mês");
	 double ganhoHora=valores.nextDouble();
	 double horasMes=valores.nextDouble();
	 double salario= ganhoHora*horasMes;
	 System.out.println("Seu salário é: "+ salario);
	 
 }
}

import java.util.Scanner;
public class Soma {
 public static void main(String []args) {
	 Scanner operacao = new Scanner (System.in);
	 System.out.println("Digite dois números a serem somados");
	 double num1=operacao.nextDouble();
     double num2=operacao.nextDouble();
     double resultado= num1+num2;
     System.out.println("O resultado da soma dos números inseridos é : "+ resultado);
 }
}

import java.util.Scanner;
public class IntervaloEntreNumeros {
	public static void main(String [] args) {
	Scanner scan= new Scanner(System.in);
	System.out.println("Insira dois n�meros que lhe mostrarei o intervalo entre eles");
	double num1=scan.nextDouble();
	double num2=scan.nextDouble();
	
	   if (num1>num2 || num1==num2){
		System.out.println("Insira dois n�meros sendo que o primeiro seja maior que o segundo ");
		 num1=scan.nextDouble();
		 num2=scan.nextDouble();
		 while (num1>num2) {
		 System.out.println("digite uma sequ�ncia v�lida");
		 num1=scan.nextDouble();
		 num2=scan.nextDouble();
		 }while(num1<num2) {
			    System.out.println("A sequ�ncia entre esses n�meros � :");
				System.out.println(num1);
				num1++;}
		  
		 }else{
				while(num1<num2) {
					System.out.println("A sequ�ncia entre esses n�meros � :");
					System.out.println(num1);
					num1++;
				
	}
	
		 }
	   }
}


import java.util.Scanner;
public class Tarea2{
	public static void main(String[] args){
		Scanner lector = new Scanner(System.in);
		System.out.print("Ingrese un numero: ");
		double n1 = lector.nextDouble();
		System.out.print("Ingrese el segundo: ");
		double n2 = lector.nextDouble();
		double mayor;
		double menor;
		double promedio;
		if(n1>n2){
			mayor = n1;
			menor = n2;
		}else{
			mayor = n2;
			menor = n1;
		}
		promedio = (n1+n2)/(2.0);

		System.out.println("\nEl mayor es: " +mayor);
		System.out.println("El menor es: " +menor);
		System.out.println("El promedio es: "+promedio);
	}
}

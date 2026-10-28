import java.util.Scanner;
public class Tarea1{
	public static void main(String[] args){
		Scanner lector = new Scanner(System.in);
		System.out.print("Ingrese un numero: ");
		int x = lector.nextInt();
		System.out.print("Ingrese otro numero: ");
		int y = lector.nextInt();

		if(y<=x){
			System.out.println("Error: el segundo numero debe ser mayor al primero");
			return;
		}
		System.out.print("Numeros intermedios: ");
		for(int i = x+1; i<y;i++){
			System.out.print(i+" ");
		}
		System.out.println("");
	}
}

import java.util.Scanner;//Importa el recurso Scanner
public class Input {
    public static void main(String[] args){
        Scanner lector = new Scanner(System.in);//Creamos un recurso de clase Scanner
        System.out.print("Como te llamas?: ");
        String nombre = lector.nextLine();//Se pide el input
        System.out.println("Hola "+ nombre);
        //Se deben cerrar los recursos siempre para liberar memoria
	lector.close();
	/*
	Para pedir un :
		-Pedir hasta el primer espacio lector.next()
		-String: lector.nextLine()
		-int: lector.nextInt()
		-double: lector.nextDouble()
	*/
    }
}


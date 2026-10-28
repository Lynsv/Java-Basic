public class InputArgs {
    public static void main(String[] args){
	//Convertir a numeros los argumentos
	int x = Integer.parseInt(args[0]);
	int y = Integer.parseInt(args[1]);
	// Operar con las variables
        int suma = x+y;
	int resta = x-y;
	int multi = x*y;
	float  division = (float)x/(float)y;
	//Mostrar en pantalla las operaciones
	System.out.println("Suma: "+suma+"\n"+"Resta:"+resta+"\n"+"multiplicacion: "+multi+"\n"+"division: "+division);
	/*
	Para conversion de tipos con clases primitivas
	(Tipo destino) valor ej: (double) 32
	Para convertir String a:
		-int: Integer.parseInt("58")
		-double: Double.parseDouble("1.45")
	*/
    }
}

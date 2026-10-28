package poo;

import poo.polimorfismo.Alumno;
import poo.polimorfismo.Profesor;
import poo.composicion.Aula;

public class Programa {
    public static void main(String[] args){
        Aula aula = new Aula();
        Alumno juan = new Alumno("Juan","Perez","1234567","17","Ing",aula);
        Alumno pedro = new Alumno("Pedro","Sanchez","1234567","17","Ing",aula);
        Profesor nieves = new Profesor("Nieves","Nose","0","Nose",-10,aula);

        nieves.enseniar();
        nieves.dejarTarea();

        juan.estudiar();
        juan.hacerTarea();
        pedro.hacerTarea();

        nieves.llamarLista();
    }
}

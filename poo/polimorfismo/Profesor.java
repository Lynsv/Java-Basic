package poo.polimorfismo;

import poo.composicion.Aula;
import poo.abstraccion.Persona;
import poo.interfaces.ICorrer;

public class Profesor extends Persona implements ICorrer{
    public Profesor(String nombre, String apellido, String cedula, String materia, int salario,Aula aula) {
        super(nombre, apellido, cedula);
        this.nroIps = materia;
        this.salario = salario;
        this.aula = aula;
        aula.setProfe(this);
        hayTarea = false;
        ensenio = false;
    }

    //Getters
    public String getMateria(){
        return nroIps;
    }

    public int getSalario(){
        return salario;
    }

    public boolean getHayTarea(){
        return hayTarea;
    }

    //Setters
    public void setMateria(String NroIps){
        this.nroIps = NroIps;
    }

    public void setSalario(int salario){
        this.salario = salario;
    }

    //Métodos
    public void enseniar(){
        ensenio = true;
        System.out.println(getNombre()+" esta enseñando");
    }

    public void dejarTarea(){
        if(hayTarea){
            System.out.println(getNombre()+" ya dejo tarea");
            return;
        }
        if(!ensenio){
            System.out.println("Todavia no enseño la clase para dejar tarea");
            return;
        };
        System.out.println(getNombre()+" dejo tarea");
        hayTarea = true;
    }

    public void llamarLista(){
        for (Alumno l : aula.getListaAlumnos()){
            System.out.println(l.getNombre() + " "+l.getApellido()+" está presente");
        }
    }

    public void correr(){
        System.out.println(getNombre()+"intento correr y se rompió la espalda");
    }

    //Variables privadas
    private String nroIps;
    private int salario;
    private boolean ensenio;
    private boolean hayTarea;
    private Aula aula;
}


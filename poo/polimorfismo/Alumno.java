package poo.polimorfismo;
import poo.abstraccion.Persona;
import poo.composicion.Aula;
import poo.interfaces.ICorrer;

public class Alumno extends Persona implements ICorrer{

    public Alumno(String nombre, String apellido, String cedula,String nroAlumno, String carrera, Aula aula) {
        super(nombre, apellido, cedula);
        this.nroAlumno = nroAlumno;
        this.carrera = carrera;
        this.aula = aula;
        aula.entrar(this);
        estudio = false;
        hacerTarea = false;
    }


    //Getters
    public String getNroAlumno(){
        return nroAlumno;
    }

    public String getCarrera(){
        return carrera;
    }

    //Setters
    public void setNroAlumno(String NroAlumno){
        this.nroAlumno = NroAlumno;
    }

    public void setCarrera(String carrera){
        this.carrera = carrera;
    }

    //Métodos
    public void estudiar(){
        System.out.println(getNombre()+" esta estudiando");
        estudio = true;
    }

    public void hacerTarea(){
        Profesor profe = aula.getProfe();
        if(profe == null){
            System.out.println("Aun no hay profe en la sala");
            return;
        }
        if(!profe.getHayTarea()){
            System.out.println("El profe aun no dejo tarea");
            return;
        }
        if(!estudio){
            System.out.println(getNombre()+" intento hacer la tarea, pero aún no estudió");
            return;
        }
        if(hacerTarea){
            System.out.println(getNombre()+" ya hizo su tarea");
            return;
        }
        hacerTarea = true;
        System.out.println(getNombre()+ " hizo su tarea");
    }

    public void faltar(){
        System.out.println(getNombre()+" esta fingiendo estar enfermo para no ir a clases");
        aula.salir(this);
    }

    public void correr(){
        System.out.println(getNombre() + "esta corriendo por la calle");
    }

    //Variables Privadas
    private String nroAlumno;
    private String carrera;
    private boolean estudio;
    private boolean hacerTarea;
    private Aula aula;
}

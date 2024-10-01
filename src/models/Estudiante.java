package models;

public class Estudiante {

    private String codigo;
    private String nombre;
    private int edad;
    private String carrera;
    private Nota nota;



    public Estudiante(String codigo, String nombre, int edad, String carrera, Nota nota) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.nota = nota;

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public Nota getNota() {
        return nota;
    }

    public void setNota(Nota nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", carrera='" + carrera + '\'' +
                ", nota=" + nota +
                '}';
    }
}



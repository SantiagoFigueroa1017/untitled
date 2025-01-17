package models;

public class Nota {

    private double nota1;
    private double nota2;
    private double nota3;
    private double examen;
    private double definitiva;

    public Nota(){
        this.nota1 = 0.0;
        this.nota2 = 0.0;
        this.nota3 = 0.0;
        this.examen = 0.0;
        this.definitiva = 0.0;
    }

    public Nota(double nota1, double nota2, double nota3, double examen, double definitiva) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.examen = examen;
        this.definitiva = definitiva;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getExamen() {
        return examen;
    }

    public void setExamen(double examen) {
        this.examen = examen;
    }

    public double getDefinitiva() {
        return definitiva;
    }

    public void setDefinitiva(double definitiva) {
        this.definitiva = definitiva;
    }

    @Override
    public String toString() {
        return "Nota{" +
                "nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", nota3=" + nota3 +
                ", examen=" + examen +
                ", definitiva=" + definitiva +
                '}';
    }
}

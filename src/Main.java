import models.Estudiante;
import services.EstudianteService;

public class Main {
    public static void main(String[] args) {
        EstudianteService estudianteService = new EstudianteService();
        estudianteService.menu();
    }
}
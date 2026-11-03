package EjerciciosJavaUD2;
/** ... @author RodrigoPatiñoSeijo */
import java.util.Scanner;
public class CineUDAW {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int FILAS = 6;
        final int COLUMNAS = 8;
        final char LIBRE = '-';
        final char OCUPADA = 'x';
        String SALA = "";
        final String MENU = """
        ===== CineDAW =====
        1. Ver sala
        2. Comprar entrada
        3. Estadísticas
        0. Salir
        Elige una opción:
        """;

        System.out.println(MENU);


    }
}


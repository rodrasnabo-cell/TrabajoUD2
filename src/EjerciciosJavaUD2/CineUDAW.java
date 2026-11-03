package EjerciciosJavaUD2;
/** ... @author RodrigoPatiñoSeijo */
import java.util.Scanner;
import java.util.InputMismatchException;
public class CineUDAW {
    static final String MENU = """  
           ===== CineDAW =====
           1. Ver sala
           2. Comprar entrada
           3. Estadísticas
           0. Salir
           Elige una opción:
           """;


    static final int FILAS = 6;
    static final int BUTACAS_POR_FILA = 8;
    static final int PRECIO_GENERAL = 850;
    static final String LIBRE = "-";
    static final String OCUPADA = "X";




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        String sala = "";
        for (int i=0;i < 48;i++){
            sala += LIBRE;
        }


    }
}


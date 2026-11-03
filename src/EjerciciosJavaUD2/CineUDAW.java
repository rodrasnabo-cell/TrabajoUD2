package EjerciciosJavaUD2;
/**
 * ... @author RodrigoPatiñoSeijo
 */

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
    static final String LIBRE = "-";
    static final String OCUPADA = "X";
    static final int JUNIOR = 500;
    static final int SENIOR = 600;
    static final int PRECIO_GENERAL = 850;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        String sala = "";
        for (int i = 0; i < 48; i++) {
            sala += LIBRE;
        }

        do {
            System.out.println(MENU);
            System.out.println("Indtroduce tu opción");
           try {
               opcion = sc.nextInt();
            }catch (InputMismatchException e){
               System.out.println("Opción no válida");
               sc.nextLine();
               opcion=-1;
           }
           switch (opcion){
               case 1:

           }



        }while (opcion!=0);


    }
}


package EjerciciosJavaUD2;
/**
 * ... @author RodrigoPatiñoSeijo
 */

import javax.swing.*;
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

            try {
                opcion = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Opción no válida");
                sc.nextLine();
                opcion = -1;
            }
            switch (opcion) {
                case 1:
                    System.out.println(" P A N T A L L A");
                    System.out.println(" 1 2 3 4   5 6 7 8");
                    for (char fila = 'A'; fila <= 'F'; fila++) {
                        System.out.print(fila);

                        for (int butaca = 1; butaca <= BUTACAS_POR_FILA; butaca++) {
                            int posicion = (fila - 'A') * BUTACAS_POR_FILA + (butaca - 1);
                            // 2. Extraemos el carácter ('-' o 'X') de esa posición
                            char asiento = sala.charAt(posicion);

                            System.out.print('-' + " ");
                            if (butaca == 4) {
                                System.out.print("  ");
                            }


                        }
                        System.out.println();


                    }
                case 2:
                    if (!sala.contains(LIBRE)) {
                        System.out.println("No quedan sitios libres");


                    } else {
                        String filaStr = "";
                        boolean filaValida = false;
                        while (!filaValida) {
                            System.out.println("Introduce una fila (A-F)");
                            filaStr = sc.nextLine().trim().toUpperCase();

                            if (filaStr.length() == 1 && filaStr.charAt(0) >= 'A' && filaStr.charAt(0) <= 'F') {
                                filaValida = true;
                            } else {
                                System.out.println("Fila incorrecta debe ser una fila entre A y F");

                            }


                        }
                        char fila = filaStr.charAt(0);


                    }
            }


        } while (opcion != 0);
    }
}

